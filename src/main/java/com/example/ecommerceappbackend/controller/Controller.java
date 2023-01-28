package com.example.ecommerceappbackend.controller;


import com.example.ecommerceappbackend.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
@RequestMapping("/shoe")
public class Controller {

    @Autowired
    Service service;

    @GetMapping
    public ResponseEntity<?> getAllShoes(){
        return ResponseEntity.ok(service.getAllShoes());
    }
}
