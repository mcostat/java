package com.example.udemy.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.udemy.demo.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
