package com.codeclan.coursebooker.coursebooker.controllers;

import com.codeclan.coursebooker.coursebooker.models.Course;
import com.codeclan.coursebooker.coursebooker.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> getCoursesByRating(@PathVariable int rating){
        return courseRepository.getCoursesByRating(rating);
    }

    @GetMapping(value = "/customers/{customer_id}/courses")
    public List<Course> getCoursesByCustomerId(@PathVariable Long customer_id){
        return courseRepository.getCoursesByCustomerId(customer_id);
    }



}
