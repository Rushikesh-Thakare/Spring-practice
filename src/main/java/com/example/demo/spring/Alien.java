package com.example.demo.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;
@Configuration
@Component
public class Alien {

    @Value("21")
    private int age;
    private Computer com;

    public Alien() {
        System.out.println("Alien Object Created");
    }

//	@ConstructorProperties({"age","lap"})
//	public Alien(int age,Computer lap) {
//		System.out.println("Para Constructor Called");
//		this.age = age;
//		this.lap = lap;
//	}

    public int getAge() {
        return this.age;
    }
//    @Value("21")
//    public void setAge(int age) {    // Setter Injection
//        //System.out.println("Setter called");
//        this.age = age;
//    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Coding by Alien");
        com.compile();
    }

}
