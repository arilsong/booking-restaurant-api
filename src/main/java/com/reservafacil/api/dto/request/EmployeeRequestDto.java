package com.reservafacil.api.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record EmployeeRequestDto(
        @NotBlank String name,
        @NotBlank @Email String email,
        @NotBlank String phone,
        @NotBlank String password
) {
}
