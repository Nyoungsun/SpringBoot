package com.example.hellotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication //스프링 부트로 만든 애플리케이션의 시작 클래스임을 의미한다.
public class HelloTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloTestApplication.class, args);
        System.out.println("Hello World");
    }
}
