package com.codeclan.coursebooker.coursebooker.projections;

import com.codeclan.coursebooker.coursebooker.models.Booking;
import com.codeclan.coursebooker.coursebooker.models.Course;
import com.codeclan.coursebooker.coursebooker.models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedBookingIntoCourse", types = Booking.class)
public interface EmbedBookingIntoCourse {
    String getDate();
    Course getCourse();
    Customer getCustomer();
}
