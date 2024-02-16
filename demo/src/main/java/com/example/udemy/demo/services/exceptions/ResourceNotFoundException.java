package com.example.udemy.demo.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    
    public ResourceNotFoundException(Object id) {
        super("Rsource Not Found. Id: " + id);
    }
}
