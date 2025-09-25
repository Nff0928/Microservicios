package com.course.course.service;

import com.course.course.entity.Course;

public interface CourseService {

    Course saveCourse(Course course);
    Course findByCourseCode(String courseCode);
    
}
