package com.enrollment.enrollment.dto;

public record EnrollmentResponseDto(
    EnrollmentDto enrollmentDto,
    CourseDTO courseDTO,
    StudentDto studentDto
) {
    
}
