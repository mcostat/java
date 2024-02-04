package com.example.udemy.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.udemy.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
