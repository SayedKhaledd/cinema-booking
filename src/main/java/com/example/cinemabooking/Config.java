package com.example.cinemabooking;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;



@Configuration
public class Config {

    @Bean
    public Person personMary() {
        return new Person("Mary");
    }
}
