package com.reservafacil.api.dto.response;

import java.util.UUID;

public record ReviewResponseDto(
        UUID id,
        int classification,
        String comment,
        String restaurantResponse
){}
