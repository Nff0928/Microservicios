package com.enrollment.enrollment.service;


import com.enrollment.enrollment.dto.EnrollmentDto;
import com.enrollment.enrollment.dto.EnrollmentResponseDto;



public interface EnrollmentService  {
    EnrollmentDto saveEnrollment(EnrollmentDto enrollmentDto);
    EnrollmentResponseDto findById(Long id);
    
}
