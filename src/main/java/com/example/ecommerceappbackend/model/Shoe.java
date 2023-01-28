package com.example.ecommerceappbackend.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="shoes")
public class Shoe {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String name;

        @Column(nullable = false)
        private String brand;

        @Column(nullable = false)
        private BigDecimal price;

        @Column(nullable = false)
        private String color;

        @Column(nullable = false)
        private String size;

        @Column(nullable = false)
        private String category;

        @Column(nullable = false)
        private String gender;

    public Shoe(Long id, String name, String brand, BigDecimal price, String color, String size, String category, String gender) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.size = size;
        this.category = category;
        this.gender = gender;
    }

    public Shoe() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
