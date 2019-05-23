package com.codeclan.coursebooker.coursebooker.repositories.CustomerRepository;

import com.codeclan.coursebooker.coursebooker.models.Customer;
import com.codeclan.coursebooker.coursebooker.projections.EmbedCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedCustomer.class)
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
    List<Customer> getCustomersByCourseId(Long courseId);

    List<Customer> getCustomersByTownAndCourseId(String town, Long courseId);

    List<Customer> getCustomersOverCertainAgeByTownAndCourseId(int age, String town, Long course_id);
}
