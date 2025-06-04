package com.reservafacil.api.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserRequestDto(
        @NotBlank String name,
        @NotBlank @Email String email,
        @NotBlank int phone,
        @NotBlank String password
) { }
