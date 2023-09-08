package com.matheusdoedev.todolistmanager.api.mapper;

import java.util.ArrayList;
import java.util.List;

import com.matheusdoedev.todolistmanager.api.dto.TaskDto;
import com.matheusdoedev.todolistmanager.api.model.Task;

public class TaskMapper {

	private TaskMapper() {
	}

	public static TaskDto parseToTaskDto(Task task) {
		return new TaskDto(
				task.getId(),
				task.getName(),
				task.getDescription(),
				task.getIsDue(),
				task.getPriority());
	}

	public static Task parseToTaskJPAEntity(TaskDto taskDto) {
		return new Task(
				taskDto.getId(),
				taskDto.getName(),
				taskDto.getDescription(),
				taskDto.getIsDue(),
				taskDto.getPriority());
	}

	public static List<TaskDto> parseToTasksDtoList(List<Task> tasks) {
		ArrayList<TaskDto> tasksDto = new ArrayList<>(tasks.size());

		for (int x = 0; x < tasks.size(); x++) {
			tasksDto.add(x, parseToTaskDto(tasks.get(x)));
		}

		return tasksDto;
	}
}
