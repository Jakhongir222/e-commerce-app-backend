package com.example.ecommerceappbackend.repository;


import com.example.ecommerceappbackend.model.Shoe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ShoeRepository {

    @Autowired
    JPAShoeRepository repo;

    public Object getAllShoes() {
        return repo.findAll();
    }

    public Object getSpecificShoe(Long id) {
        return repo.findById(id);
    }

    public Object createNewShoe(Shoe shoe) {
        return repo.save(shoe);

    }

    public void deleteShoe(Long id) {
        repo.deleteById(id);
    }

    public void updateShoe(Shoe updatedShoe) {
        repo.save(updatedShoe);
    }
}
