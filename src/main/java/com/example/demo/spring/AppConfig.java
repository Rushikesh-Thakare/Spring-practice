package com.example.demo.spring;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.example.demo.spring")
public class AppConfig {

	@Bean
	public Laptop laptop() {
		return new Laptop();
	}

	@Bean
	public Alien alien() {
		Alien obj = new Alien();
		obj.setCom(laptop());
		obj.code();
		System.out.println("age of alien is: "+ obj.getAge());
		return obj;
	}



}
