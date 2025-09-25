package com.course.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.course.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

    Course findByCourseCode(String courseCode);

    
}
