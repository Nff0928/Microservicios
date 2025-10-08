package com.enrollment.enrollment.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.enrollment.enrollment.dto.CourseDTO;

@FeignClient(url = "http://localhost:9090/api/courses", value =  "Course")
public interface OpenFeignConsumeCourse {


    @GetMapping("/course/{courseCode}")
    public CourseDTO findByCourseCode(@PathVariable String courseCode); 
    

    
}
