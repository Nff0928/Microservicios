package com.course.course.config;

import com.course.course.dto.CourseDTO;
import com.course.course.entity.Course;

public class CourseMapper {
    public static CourseDTO toDTO(Course course) {
        return new CourseDTO(
            course.getId(),
            course.getCourseCode(),
            course.getTittle(),
            course.getDescription()
        );
    }
}
