package com.reservafacil.api.controllers;

import com.reservafacil.api.dto.request.RestaurantRequestDto;
import com.reservafacil.api.entities.Restaurant;
import com.reservafacil.api.entities.User;
import com.reservafacil.api.services.impl.RestaurantServiceImpl;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/v1/api/restaurant")
@RequiredArgsConstructor
public class RestaurantController {
    private final RestaurantServiceImpl restaurantService;

    @PostMapping
    public ResponseEntity<Restaurant> createRestaurant(@RequestBody @Valid RestaurantRequestDto requestDto){
        Restaurant restaurant = restaurantService.createRestaurant(requestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(restaurant);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Restaurant> getRestaurant(@PathVariable UUID id){
        Optional<Restaurant> restaurant = restaurantService.getRestaurant(id);
        return restaurant.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Restaurant> updateUser(@RequestBody @Valid RestaurantRequestDto requestDto, @PathVariable UUID id){
        Restaurant updatedRestaurant = restaurantService.updateRestaurant(requestDto, id);
        return ResponseEntity.ok(updatedRestaurant);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRestaurant(@PathVariable UUID id){
        restaurantService.deleteRestaurant(id);
        return ResponseEntity.noContent().build();
    }
}
