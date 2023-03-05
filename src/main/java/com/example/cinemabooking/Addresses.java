package com.example.cinemabooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Addresses {

    @Bean("the new address")
    public String address() {
        return "New Cairo, Cairo, Egypt";
    }
}
