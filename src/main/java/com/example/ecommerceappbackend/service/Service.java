package com.example.ecommerceappbackend.service;


import com.example.ecommerceappbackend.model.JsonFileReader;
import com.example.ecommerceappbackend.model.Shoe;
import com.example.ecommerceappbackend.repository.ShoeRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    ShoeRepository repo;

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void loadData(String filePath) throws IOException {
        JsonFileReader jsonFileReader = new JsonFileReader();
        Shoe[] data = (Shoe[]) jsonFileReader.readJsonFile(filePath, Shoe[].class);
        for (Shoe shoe : data) {
            entityManager.persist(shoe);
        }
    }

    public Object getAllShoes() {
        return repo.getAllShoes();
    }


}
