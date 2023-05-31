package com.example.chapter01gradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"board.controller", "com.example.chapter01gradle.controller"})
public class Chapter01GradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Chapter01GradleApplication.class, args);
	}

}
