package com.example.cinemabooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@SpringBootApplication
public class CinemabookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(CinemabookingApplication.class, args);

//        User user = new User("sayed", "ss", "pass");
//        user.name();


    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);


    }

    @Bean("the old address")
    public String address() {
        return "Helwan, Cairo, Egypt";
    }

    @Bean
    public Customer customer(@Qualifier("the old address") String address) {
        return new Customer("sayed", address);
    }

    @Bean
    public Customer temporary(@Autowired Customer customer) {
        System.out.println(customer);
        return customer;
    }

    @Bean
    public Customer temporoay2(@Autowired Customer customer) {
        System.out.println(customer);
        return customer;
    }


}
