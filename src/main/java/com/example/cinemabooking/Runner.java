package com.example.cinemabooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Runner implements CommandLineRunner {
    private final PasswordGenerator generator;

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        Arrays.toString(applicationContext.getBeanDefinitionNames());
    }

    @Autowired
    public Runner(PasswordGenerator passwordGenerator) {
        generator = passwordGenerator;

    }
}
