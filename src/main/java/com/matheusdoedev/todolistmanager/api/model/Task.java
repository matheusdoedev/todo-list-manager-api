package com.matheusdoedev.todolistmanager.api.model;

import java.util.UUID;

import com.matheusdoedev.todolistmanager.api.constant.TaskPriorities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tasks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	@Column(length = 50, nullable = false)
	private String name;

	@Column(length = 200, nullable = false)
	private String description;

	@Column(name = "is_due", nullable = false)
	private Boolean isDue;

	@Column(name = "priority")
	private TaskPriorities priority;
}
