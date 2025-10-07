package com.enrollment.enrollment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enrollment.enrollment.dto.EnrollmentDto;
import com.enrollment.enrollment.dto.EnrollmentResponseDto;
import com.enrollment.enrollment.entity.Enrollment;
import com.enrollment.enrollment.service.EnrollmentService;

import lombok.AllArgsConstructor;

@RequestMapping("/api/enrollments")
@RestController
@AllArgsConstructor
public class EnrollmentController {

    private final EnrollmentService enrollmentService;


    @PostMapping
    public EnrollmentDto save(@RequestBody EnrollmentDto enrollmentDto){
        return enrollmentService.saveEnrollment(enrollmentDto);
    }


    @GetMapping("/{id}")
    public EnrollmentResponseDto findById(@PathVariable Long id){
        return enrollmentService.findById(id);
    }
    
    
}
