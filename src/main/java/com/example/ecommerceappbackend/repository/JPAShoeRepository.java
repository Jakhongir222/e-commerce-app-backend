package com.example.ecommerceappbackend.repository;

import com.example.ecommerceappbackend.model.Shoe;
import org.springframework.data.repository.CrudRepository;

public interface JPAShoeRepository extends CrudRepository<Shoe, Long> {
}
