package com.matheusdoedev.todolistmanager.api.dto;

import com.matheusdoedev.todolistmanager.api.constant.TaskPriorities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateTaskDto {
	private String name;
	private String description;
	private Boolean isDue;
	private TaskPriorities priority;
}
