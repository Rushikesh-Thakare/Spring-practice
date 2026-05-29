package com.example.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("hello from first program of spring");

		DemoOne obj = new DemoOne();
		obj.setNumber(10);
		obj.setName("Rushi");

		System.out.println(obj.getNumber());
		System.out.println(obj.getName());
	}

}
