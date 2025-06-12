package com.reservafacil.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ReviewRequestDto(
        @NotNull int classification,
        @NotBlank String comment
) {
}
