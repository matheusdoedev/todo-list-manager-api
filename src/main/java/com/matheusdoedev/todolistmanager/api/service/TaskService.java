package com.matheusdoedev.todolistmanager.api.service;

import java.util.List;
import java.util.UUID;

import com.matheusdoedev.todolistmanager.api.dto.CreateTaskDto;
import com.matheusdoedev.todolistmanager.api.dto.TaskDto;
import com.matheusdoedev.todolistmanager.api.dto.UpdateTaskDto;

public interface TaskService {

	public TaskDto createTask(CreateTaskDto taskDto);

	public TaskDto updateTask(UUID taskId, UpdateTaskDto taskDto);

	public TaskDto showTask(UUID taskId);

	public List<TaskDto> listTasks();

	public void deleteTask(UUID taskId);
}
