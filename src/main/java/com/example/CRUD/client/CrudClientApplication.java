package com.example.CRUD.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@SpringBootApplication
public class CrudClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudClientApplication.class, args);
	}
}

@RestController
class MessageRestController {

	@Value("${example.property}")
	private String exampleProperty;

	@GetMapping("/message")
	public String getMessage() {
		return this.exampleProperty;
	}
}
