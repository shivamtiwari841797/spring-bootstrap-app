package com.jpmc.training.mondayapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Configuration
public class AppConfig {

    @Autowired
    public Employee employee1;

    @Autowired
    public Employee employee2;

    @Bean
    public Set<Employee> employees() {
        employee1.setId("1");
        employee1.setName("E-1");
        employee1.setLevel("L-1");

        employee2.setId("2");
        employee2.setName("E-2");
        employee2.setLevel("L-2");

        Set<Employee> employees = new HashSet<>();
        employees.add(employee1);
        employees.add(employee2);

        return employees;
    }
}
