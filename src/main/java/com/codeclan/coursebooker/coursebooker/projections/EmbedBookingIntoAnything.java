package com.codeclan.coursebooker.coursebooker.projections;

import com.codeclan.coursebooker.coursebooker.models.Booking;
import com.codeclan.coursebooker.coursebooker.models.Course;
import com.codeclan.coursebooker.coursebooker.models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedBookingIntoAnything", types = Booking.class)
public interface EmbedBookingIntoAnything {
    String getDate();
    Course getCourse();
    Customer getCustomer();
}
