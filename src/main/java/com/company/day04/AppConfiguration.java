package com.company.day04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

//beans.xml
@Configuration
public class AppConfiguration {

    @Bean
    public List<String> myHobbies() {
        return Arrays.asList("Eating", "Swimming", "Reading");
    }
}
