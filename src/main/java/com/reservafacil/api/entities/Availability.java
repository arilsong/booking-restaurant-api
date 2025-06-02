package com.reservafacil.api.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Availability {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    Restaurant restaurant;

    private String day_of_the_week;
    private String start_time;
    private String end_time;
}
