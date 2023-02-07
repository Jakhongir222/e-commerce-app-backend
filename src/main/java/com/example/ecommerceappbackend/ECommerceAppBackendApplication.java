package com.example.ecommerceappbackend;

import com.example.ecommerceappbackend.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

import java.io.File;

@SpringBootApplication
public class ECommerceAppBackendApplication {

    @Autowired
    private Service service;

    public static void main(String[] args) {
        SpringApplication.run(ECommerceAppBackendApplication.class, args);
    }


}
