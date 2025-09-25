package com.enrollment.enrollment.service;

import org.springframework.stereotype.Service;

import com.enrollment.enrollment.entity.Enrollment;
import com.enrollment.enrollment.repository.EnrollmentRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class EnrollmentServiceImpl implements EnrollmentService {


    private final EnrollmentRepository enrollmentRepository;


    @Override
    public Enrollment saveEnrollment(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    @Override
    public Enrollment findById(Long id) {
        return enrollmentRepository.findById(id).get();
    }

   
    
}
