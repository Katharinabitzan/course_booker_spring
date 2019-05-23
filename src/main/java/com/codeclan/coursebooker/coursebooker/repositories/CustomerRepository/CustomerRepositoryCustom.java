package com.codeclan.coursebooker.coursebooker.repositories.CustomerRepository;

import com.codeclan.coursebooker.coursebooker.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> getCustomersByCourseId(Long courseId);
}
