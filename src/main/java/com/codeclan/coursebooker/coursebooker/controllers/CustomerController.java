package com.codeclan.coursebooker.coursebooker.controllers;

import com.codeclan.coursebooker.coursebooker.models.Customer;
import com.codeclan.coursebooker.coursebooker.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/course/{id}/customers")
    public List<Customer> getCustomersByCourseId(@PathVariable Long id){
        return customerRepository.getCustomersByCourseId(id);
    }

    @GetMapping(value = "/{town}/{course_id}")
    public List<Customer> getCustomersByTownAndCourseId(@PathVariable String town, @PathVariable Long course_id){
        return customerRepository.getCustomersByTownAndCourseId(town, course_id);
    }

    @GetMapping(value = "/age>{age}/{town}/bookings/course_id={course_id}")
        public List<Customer> getCustomersOverCertainAgeByTownAndCourseId(@PathVariable int age, @PathVariable String town, @PathVariable Long course_id ){
            return customerRepository.getCustomersOverCertainAgeByTownAndCourseId(age, town, course_id);
        }
    }

