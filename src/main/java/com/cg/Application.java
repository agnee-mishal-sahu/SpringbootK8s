package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/message")
public class Application {
	
	@GetMapping("/msg")
	public String getMessage() {
		return "hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}

}
