package com.reservafacil.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public record AvailabilityRequestDto(
        @NotEmpty List<@NotBlank String> days_of_the_week,
        @NotBlank String start_time,
        @NotBlank String end_time
) {
}
