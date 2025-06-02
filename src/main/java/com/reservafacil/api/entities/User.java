package com.reservafacil.api.entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String email;
    private String phone;
    private String password;
    private LocalDateTime created_at = LocalDateTime.now();

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings = new ArrayList<>();

}
