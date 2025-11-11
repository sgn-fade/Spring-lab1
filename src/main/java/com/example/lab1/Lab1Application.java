package com.example.lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lab1Application implements CommandLineRunner {
    private final Power power;

    public static void main(String[] args) {
        SpringApplication.run(Lab1Application.class, args);
    }

    @Autowired
    public Lab1Application(Power power) {
        this.power = power;
    }

    @Override
    public void run(String... args) throws Exception {
        power.CalculateResult();
        System.out.println("the result is " + power.getResult());
        //diff in branch 123
    }
}
