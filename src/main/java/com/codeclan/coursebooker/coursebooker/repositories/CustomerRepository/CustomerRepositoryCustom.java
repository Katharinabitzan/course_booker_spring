package com.codeclan.coursebooker.coursebooker.repositories.CustomerRepository;

import com.codeclan.coursebooker.coursebooker.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> getCustomersByCourseId(Long courseId);

    List<Customer> getCustomersByTownAndCourseId(String town, Long courseId);

    List<Customer> getCustomersOverCertainAgeByTownAndCourseId(int age, String town, Long course_id);
}
