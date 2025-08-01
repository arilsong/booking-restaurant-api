package com.reservafacil.api.repositories;

import com.reservafacil.api.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface BookingRepository extends JpaRepository<Booking, UUID> {

    Optional<Booking> findByConfirmationCode(int confirmation_code);
}
