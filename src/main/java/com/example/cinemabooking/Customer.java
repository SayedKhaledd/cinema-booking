package com.example.cinemabooking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class Customer {
    private final String name, address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
