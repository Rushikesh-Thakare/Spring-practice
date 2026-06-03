package com.springboot.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Staff {

    @Value("20000")
    private int salary;

    private final College college;

    public Staff(College college) {
        this.college = college;
    }

    public void showCollege() {
        college.collegeName();
    }

    public int getSalary() {
        return salary;
    }
}