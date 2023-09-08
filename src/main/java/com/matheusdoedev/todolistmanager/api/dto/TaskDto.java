package com.matheusdoedev.todolistmanager.api.dto;

import java.util.UUID;

import com.matheusdoedev.todolistmanager.api.constant.TaskPriorities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskDto {
	private UUID id;
	private String name;
	private String description;
	private Boolean isDue;
	private TaskPriorities priority;
}
