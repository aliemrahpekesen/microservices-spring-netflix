package com.aep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Hello Spring Boot..");
		System.out.println("This class is our init class..");
		System.out.println("And also our @Configuration Annotated Class..");
		System.out.println("And also our @ComponentScan Annotated Class..");
		System.out.println("And also out @EnableAutoConfiguration Annotated Class..");
		System.out.println(
				"All those annotations are included in this class with just @SpringBootApplication Annotation..");
	}
}
