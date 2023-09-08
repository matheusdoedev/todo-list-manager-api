package com.matheusdoedev.todolistmanager.api.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/")
@Tag(name = "health-check")
public class HealthCheckController {

	@GetMapping
	@Operation(summary = "Verify if application is running.", method = "GET")
	@ApiResponse(responseCode = "200", description = "Application is running!")
	public String getHealthCheck() {
		return new Date().toString();
	}
}
