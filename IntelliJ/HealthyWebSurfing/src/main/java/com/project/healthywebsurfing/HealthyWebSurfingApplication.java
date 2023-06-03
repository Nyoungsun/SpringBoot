package com.project.healthywebsurfing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "openapi.controller")
public class HealthyWebSurfingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthyWebSurfingApplication.class, args);
	}

}
