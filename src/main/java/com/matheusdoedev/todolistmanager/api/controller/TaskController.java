package com.matheusdoedev.todolistmanager.api.controller;

import java.util.List;
import java.util.UUID;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusdoedev.todolistmanager.api.dto.CreateTaskDto;
import com.matheusdoedev.todolistmanager.api.dto.TaskDto;
import com.matheusdoedev.todolistmanager.api.dto.UpdateTaskDto;
import com.matheusdoedev.todolistmanager.api.service.impl.TaskServiceImpl;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/tasks")
@Tag(name = "tasks")
@AllArgsConstructor
public class TaskController {

	private final TaskServiceImpl taskService;

	@PostMapping("/create")
	@Operation(summary = "Create a new task.")
	@ApiResponse(responseCode = "200", description = "Task created.")
	public ResponseEntity<TaskDto> postCreateTask(CreateTaskDto taskDto) {
		TaskDto savedTask = this.taskService.createTask(taskDto);

		return ResponseEntity.ok(savedTask);
	}

	@GetMapping("/")
	@Operation(summary = "List all tasks.")
	@ApiResponse(responseCode = "200", description = "Tasks listed.")
	public ResponseEntity<List<TaskDto>> getTasksList() {
		List<TaskDto> tasks = this.taskService.listTasks();

		return ResponseEntity.ok(tasks);
	}

	@GetMapping("{taskId}")
	@Operation(summary = "Show a specific task.")
	@ApiResponse(responseCode = "200", description = "Task found.")
	public ResponseEntity<TaskDto> getShowTask(@PathVariable("taskId") UUID taskId) {
		TaskDto task = this.taskService.showTask(taskId);

		return ResponseEntity.ok(task);
	}

	@PutMapping("/update/{taskId}")
	@Operation(summary = "Update a task.")
	@ApiResponse(responseCode = "200", description = "Task updated.")
	public ResponseEntity<TaskDto> putUpdateTask(@PathVariable("taskId") UUID taskId, UpdateTaskDto taskDto) {
		TaskDto updatedTask = this.taskService.updateTask(taskId, taskDto);

		return ResponseEntity.ok(updatedTask);
	}

	@DeleteMapping("/delete/{taskId}")
	@Operation(summary = "Delete a task.")
	@ApiResponse(responseCode = "200", description = "Task deleted.")
	public ResponseEntity<String> deleteTask(@PathVariable("taskId") UUID taskId) {
		this.taskService.deleteTask(taskId);

		return ResponseEntity.ok("Task deleted!");
	}
}
