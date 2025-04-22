package edu.icet.booking.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepository<Booking> extends JpaRepository<Booking, Long> {

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);
}
