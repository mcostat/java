package com.example.udemy.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.udemy.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
