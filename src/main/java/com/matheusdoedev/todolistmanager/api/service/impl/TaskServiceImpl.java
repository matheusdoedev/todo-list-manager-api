package com.matheusdoedev.todolistmanager.api.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.matheusdoedev.todolistmanager.api.dto.CreateTaskDto;
import com.matheusdoedev.todolistmanager.api.dto.TaskDto;
import com.matheusdoedev.todolistmanager.api.dto.UpdateTaskDto;
import com.matheusdoedev.todolistmanager.api.exception.ResourceNotFoundException;
import com.matheusdoedev.todolistmanager.api.mapper.TaskMapper;
import com.matheusdoedev.todolistmanager.api.model.Task;
import com.matheusdoedev.todolistmanager.api.repository.TaskRepository;
import com.matheusdoedev.todolistmanager.api.service.TaskService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {

	static final String TASK_ID_FIELD_NAME = "taskId";

	private final TaskRepository taskRepository;

	public TaskDto createTask(CreateTaskDto taskDto) {
		UUID taskId = UUID.randomUUID();
		TaskDto taskDtoToBeSaved = new TaskDto(
				taskId,
				taskDto.getName(),
				taskDto.getDescription(),
				taskDto.getIsDue(),
				taskDto.getPriority());

		Task task = TaskMapper.parseToTaskJPAEntity(taskDtoToBeSaved);

		this.taskRepository.save(task);

		return taskDtoToBeSaved;
	}

	public TaskDto updateTask(UUID taskId, UpdateTaskDto taskDto) {
		Optional<Task> task = this.taskRepository.findById(taskId);

		if (!task.isPresent()) {
			throw new ResourceNotFoundException("Task", TASK_ID_FIELD_NAME, taskId.toString());
		}

		Task savedTask = task.get();

		if (taskDto.getName().isPresent()) {
			savedTask.setName(taskDto.getName().get());
		}

		if (taskDto.getDescription().isPresent()) {
			savedTask.setDescription(taskDto.getDescription().get());
		}

		if (taskDto.getIsDue().isPresent()) {
			savedTask.setIsDue(taskDto.getIsDue().get());
		}

		if (taskDto.getPriority().isPresent()) {
			savedTask.setPriority(taskDto.getPriority().get());
		}

		this.taskRepository.save(savedTask);

		return TaskMapper.parseToTaskDto(savedTask);
	}

	public TaskDto showTask(UUID taskId) {
		Optional<Task> task = this.taskRepository.findById(taskId);

		if (!task.isPresent()) {
			throw new ResourceNotFoundException("Task", TASK_ID_FIELD_NAME, taskId.toString());
		}

		return TaskMapper.parseToTaskDto(task.get());
	}

	public List<TaskDto> listTasks() {
		List<Task> tasks = this.taskRepository.findAll();

		return TaskMapper.parseToTasksDtoList(tasks);
	}

	public void deleteTask(UUID taskId) {
		Optional<Task> task = this.taskRepository.findById(taskId);

		if (!task.isPresent()) {
			throw new ResourceNotFoundException("Task", TASK_ID_FIELD_NAME, taskId.toString());
		}

		this.taskRepository.delete(task.get());
	}
}
