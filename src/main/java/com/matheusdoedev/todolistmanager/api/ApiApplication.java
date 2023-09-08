package com.matheusdoedev.todolistmanager.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Todo List Manager", version = "v1.0.0", description = "Todo list API manager.", contact = @Contact(name = "Matheus do É", email = "matheusdoedev@gmail.com", url = "https://github.com/matheusdoedev")))
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
}
