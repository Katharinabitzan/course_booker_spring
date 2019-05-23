package com.codeclan.coursebooker.coursebooker.repositories.CourseRepository;

import com.codeclan.coursebooker.coursebooker.models.Course;
import com.codeclan.coursebooker.coursebooker.projections.EmbedCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedCourse.class)
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    List<Course> getCoursesByRating(int Rating);

    List<Course> getCoursesByCustomerId(Long customerId);
}
