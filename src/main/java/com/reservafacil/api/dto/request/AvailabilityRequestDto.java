package com.reservafacil.api.dto.request;

import jakarta.validation.constraints.NotBlank;

public record AvailabilityRequestDto(
        @NotBlank String day_of_the_week,
        @NotBlank String start_time,
        @NotBlank String end_time
) {
}
