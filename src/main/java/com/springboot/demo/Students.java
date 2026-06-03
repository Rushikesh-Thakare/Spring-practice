package com.springboot.demo;

import org.springframework.stereotype.Component;

@Component
public class Students implements College {

    @Override
    public void collegeName() {
        System.out.println("Your college name is GPM");
    }
}