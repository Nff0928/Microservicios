package com.enrollment.enrollment.service;

import com.enrollment.enrollment.entity.Enrollment;


public interface EnrollmentService  {
    Enrollment saveEnrollment(Enrollment enrollment);
    Enrollment findById(Long id);
    
}
