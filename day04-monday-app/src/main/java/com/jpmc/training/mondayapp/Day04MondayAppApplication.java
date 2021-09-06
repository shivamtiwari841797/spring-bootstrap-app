package com.jpmc.training.mondayapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day04MondayAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Day04MondayAppApplication.class, args);
    }

    @Autowired
    private Company company;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(company);
    }
}
