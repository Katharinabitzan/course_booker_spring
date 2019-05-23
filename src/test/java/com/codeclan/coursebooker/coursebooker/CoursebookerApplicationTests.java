package com.codeclan.coursebooker.coursebooker;

import com.codeclan.coursebooker.coursebooker.models.Booking;
import com.codeclan.coursebooker.coursebooker.models.Course;
import com.codeclan.coursebooker.coursebooker.models.Customer;
import com.codeclan.coursebooker.coursebooker.repositories.BookingRepository.BookingRepository;
import com.codeclan.coursebooker.coursebooker.repositories.CourseRepository.CourseRepository;
import com.codeclan.coursebooker.coursebooker.repositories.CustomerRepository.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoursebookerApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateCourseBookingAndCustomer() {
		Course course = new Course("Java", "Edinburgh", 5);
		courseRepository.save(course);

		Customer customer = new Customer("Jamie", "Edinburgh", 23);
		customerRepository.save(customer);

		Booking booking = new Booking("01-07-19", course, customer);
		bookingRepository.save(booking);

	}
}
