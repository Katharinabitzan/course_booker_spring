package com.codeclan.coursebooker.coursebooker.controllers;

import com.codeclan.coursebooker.coursebooker.models.Booking;
import com.codeclan.coursebooker.coursebooker.repositories.BookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/date/{date}")
    public List<Booking> getBookingsByDate(@PathVariable String date){
        return bookingRepository.getBookingsByDate(date);
    }

}
