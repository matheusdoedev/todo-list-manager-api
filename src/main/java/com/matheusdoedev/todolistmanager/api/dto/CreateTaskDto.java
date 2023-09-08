package com.matheusdoedev.todolistmanager.api.dto;

import com.matheusdoedev.todolistmanager.api.constant.TaskPriorities;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(description = "Task DTO schema for create task feature body.")
public class CreateTaskDto {
	@Schema(description = "Task name.")
	private String name;

	@Schema(description = "Task description.")
	private String description;

	@Schema(description = "If the task was did or not.")
	private Boolean isDue;

	@Schema(description = "Task priority.")
	private TaskPriorities priority;
}
