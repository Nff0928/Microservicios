package com.enrollment.enrollment.service;

import com.enrollment.enrollment.dto.EnrollmentDto;



public interface EnrollmentService  {
    EnrollmentDto saveEnrollment(EnrollmentDto enrollmentDto);
    EnrollmentDto findById(Long id);
    
}
