package com.example.chapter01maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"board.controller", "com.example.chapter01maven.controller"})
public class Chapter01MavenApplication {

    public static void main(String[] args) {
        //SpringApplication.run(Chapter01MavenApplication.class, args);

        SpringApplication springApplication = new SpringApplication(Chapter01MavenApplication.class);
        springApplication.setWebApplicationType(WebApplicationType.NONE); //웹으로 동작하지 않도록 설정 → application.properties에 servlet으로 설정했기 때문에(우선권) 서버가 실행됨
        springApplication.run(args);
    }
}
