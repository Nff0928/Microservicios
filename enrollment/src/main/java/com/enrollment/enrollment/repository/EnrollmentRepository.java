package com.enrollment.enrollment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.enrollment.enrollment.entity.Enrollment;



public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
    
    
}
