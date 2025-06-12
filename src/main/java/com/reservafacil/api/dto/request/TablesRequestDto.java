package com.reservafacil.api.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TablesRequestDto(
        @NotNull int number,
        @NotNull int capacity,
        @NotBlank String location
) {
}
