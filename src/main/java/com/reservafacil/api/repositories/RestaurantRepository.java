package com.reservafacil.api.repositories;

import com.reservafacil.api.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RestaurantRepository extends JpaRepository<Restaurant, UUID> {
}
