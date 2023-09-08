package com.matheusdoedev.todolistmanager.api.dto;

import java.util.Optional;

import com.matheusdoedev.todolistmanager.api.constant.TaskPriorities;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(description = "Task DTO schema for update task feature body.")
public class UpdateTaskDto {
	@Schema(description = "Task name.")
	private Optional<String> name;

	@Schema(description = "Task description.")
	private Optional<String> description;

	@Schema(description = "If the task was did or not.")
	private Optional<Boolean> isDue;

	@Schema(description = "Task priority.")
	private Optional<TaskPriorities> priority;
}
