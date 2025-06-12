package com.reservafacil.api.services;


import com.reservafacil.api.dto.request.BookingRequestDto;
import com.reservafacil.api.entities.Booking;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BookingService {
     Booking createBooking(BookingRequestDto bookingRequestDto, UUID restaurant_id);

     Optional<Booking> getBooking(int confirmation_code);

     List<Booking> getAllBookingResaturant();

     Booking updateBooking(BookingRequestDto bookingRequestDto, int confirmation_code);
    
     void deleteBooking(int confirmation_code);
}
