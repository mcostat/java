package com.example.udemy.demo.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_order")
public class Order  implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant data;
    
    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    public Order(Long id, Instant data, User client){
        super();
        this.id = id;
        this.data = data;
        this.client = client;
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getData() {
        return data;
    }

    public void setData(Instant data) {
        this.data = data;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

}
