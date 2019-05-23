package com.codeclan.coursebooker.coursebooker.projections;

import com.codeclan.coursebooker.coursebooker.models.Booking;
import com.codeclan.coursebooker.coursebooker.models.Course;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedCourse", types = Course.class)
public interface EmbedCourse {
    String getName();
    String getTown();
    int getRating();
    List<Booking> getBookings();
}
