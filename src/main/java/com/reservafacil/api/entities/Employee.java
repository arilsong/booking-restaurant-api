package com.reservafacil.api.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    private String name;
    private String email;
    private String phone;
    private String password;
    private String role;
    private LocalDateTime created_at = LocalDateTime.now();
}
