package com.example.ecommerceappbackend.controller;


import com.example.ecommerceappbackend.model.Shoe;
import com.example.ecommerceappbackend.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@CrossOrigin
@RestController
@RequestMapping("/shoes")
public class Controller {

    @Autowired
    Service service;

    @GetMapping
    public ResponseEntity<?> getAllShoes(){
        return ResponseEntity.ok(service.getAllShoes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getSpecificShoe(@PathVariable Long id){
        return ResponseEntity.ok(service.getSpecificShoe(id));
    }

    @PostMapping
    public ResponseEntity<?> createNewShoe (@RequestBody Shoe shoe){
        service.createNewShoe(shoe);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteShoe(@PathVariable Long id){
        service.deleteShoe(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateShoe (@PathVariable Long id, @RequestBody Shoe shoe){
        Optional<Shoe> existingShoe = (Optional<Shoe>) service.getSpecificShoe(id);
        if(!existingShoe.isPresent()){
            return ResponseEntity.notFound().build();
        }
        Shoe updatedShoe = existingShoe.get();
        updatedShoe.setName(shoe.getName());
        updatedShoe.setBrand(shoe.getBrand());
        updatedShoe.setPrice(shoe.getPrice());
        updatedShoe.setColor(shoe.getColor());
        updatedShoe.setSize(shoe.getSize());
        updatedShoe.setCategory(shoe.getCategory());
        updatedShoe.setGender(shoe.getGender());
        service.updateShoe(updatedShoe);
        return ResponseEntity.ok().build();
    }
}
