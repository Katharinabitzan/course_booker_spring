package com.codeclan.coursebooker.coursebooker.components;

import com.codeclan.coursebooker.coursebooker.models.Booking;
import com.codeclan.coursebooker.coursebooker.models.Course;
import com.codeclan.coursebooker.coursebooker.models.Customer;
import com.codeclan.coursebooker.coursebooker.repositories.BookingRepository.BookingRepository;
import com.codeclan.coursebooker.coursebooker.repositories.CourseRepository.CourseRepository;
import com.codeclan.coursebooker.coursebooker.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Course course1 = new Course("Java", "Edinburgh", 5);
        courseRepository.save(course1);

        Course course2 = new Course("Ruby", "Glasgow", 4);
        courseRepository.save(course2);

        Customer customer1 = new Customer("Jamie", "Edinburgh", 23);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Marvin", "Edinburgh", 42);
        customerRepository.save(customer2);

        Booking booking1 = new Booking("01-07-19", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("12-07-19", course1, customer2);
        bookingRepository.save(booking2);

    }

}
