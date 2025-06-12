package com.reservafacil.api.dto.response;


import java.util.UUID;

public record TablesResponseDto (
        UUID id,
        int number,
        int capacity,
        String location
){

}
