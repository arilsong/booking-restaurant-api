package com.reservafacil.api.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class Assessment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id")
    Restaurant restaurant;

    private UUID user_id;
    private int classification;
    private String comment;
    private String restaurant_response;
    private Date data;
}
