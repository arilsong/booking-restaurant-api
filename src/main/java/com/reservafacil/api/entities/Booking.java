package com.reservafacil.api.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    Restaurant restaurant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id")
    Client client;

    private Date date;
    private Time time;
    private String number_of_people;
    private String special_occasion;
    private String special_requests;
    private int confirmation_code;
    private LocalDateTime created_at = LocalDateTime.now();
}
