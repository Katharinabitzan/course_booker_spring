package com.codeclan.coursebooker.coursebooker.repositories.BookingRepository;

import com.codeclan.coursebooker.coursebooker.models.Booking;
import com.codeclan.coursebooker.coursebooker.projections.EmbedBookingIntoAnything;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedBookingIntoAnything.class)

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
    List<Booking> getBookingsByDate(String date);
}
