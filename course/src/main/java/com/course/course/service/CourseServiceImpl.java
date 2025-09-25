package com.course.course.service;

import org.springframework.stereotype.Service;

import com.course.course.entity.Course;
import com.course.course.repository.CourseRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CourseServiceImpl implements CourseService {


    private final CourseRepository courseRepository;

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course findByCourseCode(String courseCode) {
        return courseRepository.findByCourseCode(courseCode);
    }
    
}
