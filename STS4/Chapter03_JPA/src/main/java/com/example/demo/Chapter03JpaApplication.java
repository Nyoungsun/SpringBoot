package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Chapter03JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Chapter03JpaApplication.class, args);
	}

}

/*
- 스프링 데이터 JPA를 사용하는 경우는 별도의 구현 클래스를 만들지 않고 인터페이스만 정의함으로써 기능을 사용할 수 있다.
- 스프링 부트가 내부적으로 인터페이스에 대한 구현 객체를 자동으로 생성해준다. 

@Entity
JPA에서는 엔터티는 테이블에 대응하는 하나의 클래스라고 생각하면 된다
spring-boot-starter-data-jpa 의존성을 추가하고 @Entity 어노테이션을 붙이면 테이블과 자바 클래스가 매핑이 된다.
*/