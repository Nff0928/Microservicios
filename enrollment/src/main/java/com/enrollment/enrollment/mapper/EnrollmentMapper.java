package com.enrollment.enrollment.mapper;



import com.enrollment.enrollment.dto.EnrollmentDto;
import com.enrollment.enrollment.entity.Enrollment;

public class EnrollmentMapper {

    public static EnrollmentDto toDto(Enrollment enrollment) {
        return new EnrollmentDto(
            enrollment.getId(),
            enrollment.getCourseCode(),
            enrollment.getIdentificationNumber(),
            enrollment.getEnrollmentDate()
        );
    }
}   
