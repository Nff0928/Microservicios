package com.course.course.service;

import com.course.course.dto.CourseDTO;


public interface CourseService {

    CourseDTO saveCourse(CourseDTO courseDTO);
    CourseDTO findByCourseCode(String courseCode);
    
}
