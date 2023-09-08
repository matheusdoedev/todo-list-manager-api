package com.matheusdoedev.todolistmanager.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusdoedev.todolistmanager.api.model.Task;

public interface TaskRepository extends JpaRepository<Task, UUID> {

}
