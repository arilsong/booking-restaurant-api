package com.reservafacil.api.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record RestaurantRequestDto(
        @NotBlank String name,
        @NotBlank int nif,
        @NotBlank String address,
        String coordinates,
        @NotBlank @Email String email,
        @NotBlank String phone,
        @NotBlank String price_range,
        @NotBlank String description
) {
}
