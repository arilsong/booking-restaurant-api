package com.reservafacil.api.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RestaurantRequestDto(
        @NotBlank String name,
        @NotNull int nif,
        @NotBlank String address,
        String coordinates,
        @NotBlank @Email String email,
        @NotBlank String phone,
        @NotBlank String price_range,
        @NotBlank String description
) {
}
