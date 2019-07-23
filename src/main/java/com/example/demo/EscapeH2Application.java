package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EscapeH2Application {

	public static void main(String[] args) {
		SpringApplication.run(EscapeH2Application.class, args);
		System.out.print("hello_h2");
	}

}
