package com.example.udemy.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.udemy.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
