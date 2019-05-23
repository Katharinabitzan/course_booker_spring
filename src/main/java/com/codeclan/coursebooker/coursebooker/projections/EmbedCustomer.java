package com.codeclan.coursebooker.coursebooker.projections;

import com.codeclan.coursebooker.coursebooker.models.Booking;
import com.codeclan.coursebooker.coursebooker.models.Customer;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedCustomer", types = Customer.class)
public interface EmbedCustomer {
    String getName();
    String getTown();
    int getAge();
    List<Booking> getBookings();
}
