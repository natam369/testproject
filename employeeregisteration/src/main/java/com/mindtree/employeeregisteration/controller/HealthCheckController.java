package com.mindtree.employeeregisteration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	@GetMapping("/health")
	public String getServerHealth()
	{
		return "Server is up and running";
	}
}
