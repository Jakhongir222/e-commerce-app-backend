package com.example.ecommerceappbackend.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ShoeRepository {

    @Autowired
    JPAShoeRepository repo;

    public Object getAllShoes() {
        return repo.findAll();
    }
}
