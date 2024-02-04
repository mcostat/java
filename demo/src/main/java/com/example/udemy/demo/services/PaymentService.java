package com.example.udemy.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.udemy.demo.entities.Payment;
import com.example.udemy.demo.repositories.PaymentRepository;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository userRepository;

    public List<Payment> findAll() {
        return userRepository.findAll();
    }

    public Payment findById(Long id) {
        Optional<Payment> user = userRepository.findById(id);

        return user.get();
    }
}
