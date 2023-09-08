package com.matheusdoedev.todolistmanager.api.dto;

import java.util.Optional;

import com.matheusdoedev.todolistmanager.api.constant.TaskPriorities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UpdateTaskDto {
	private Optional<String> name;
	private Optional<String> description;
	private Optional<Boolean> isDue;
	private Optional<TaskPriorities> priority;
}
