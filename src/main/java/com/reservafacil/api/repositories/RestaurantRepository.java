package com.reservafacil.api.repositories;

import com.reservafacil.api.entities.Restaurant;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;

public interface RestaurantRepository extends JpaRepository<Restaurant, UUID> {
    Optional<Restaurant> findByNif(int nif);

    @Query("SELECT r FROM Restaurant r " +
            "LEFT JOIN FETCH r.tables " +
            "LEFT JOIN FETCH r.employees " +
            "LEFT JOIN FETCH r.reviews " +
            "LEFT JOIN FETCH r.availabilities " +
            "WHERE r.id = :id")
    Optional<Restaurant> findByIdWithAllData(@Param("id") UUID id);
}
