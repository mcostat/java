package com.example.udemy.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.udemy.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
