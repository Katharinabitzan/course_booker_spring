package com.codeclan.coursebooker.coursebooker.repositories.CourseRepository;

import com.codeclan.coursebooker.coursebooker.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    List<Course> getCoursesByCustomerId(Long customerId);
}
