package com.course.course.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.course.dto.CourseDTO;
import com.course.course.entity.Course;
import com.course.course.service.CourseService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseService courseService;


    @PostMapping
    public CourseDTO save(@RequestBody CourseDTO courseDTO){
        return courseService.saveCourse(courseDTO);
    }


    @GetMapping("/course/{courseCode}")
    public CourseDTO findByCourseCode(@PathVariable String courseCode){
        return courseService.findByCourseCode(courseCode);
    }

}
