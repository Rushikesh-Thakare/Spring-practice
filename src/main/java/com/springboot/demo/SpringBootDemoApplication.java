package com.springboot.demo;

import com.example.demo.spring.Alien;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(
                        SpringBootDemoApplication.class,
                        args);

        Staff staff = context.getBean(Staff.class);

        System.out.println(staff.getSalary());

        staff.showCollege();
    }

}