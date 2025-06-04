package com.reservafacil.api.dto.request;

import jakarta.validation.constraints.NotBlank;

import java.sql.Time;
import java.util.Date;

public record BookingRequestDto(
        @NotBlank Date date,
        @NotBlank Time time,
        @NotBlank String number_of_people,
        String special_occasion,
        String special_requests,
        @NotBlank int confirmation_code
        ) {

}
