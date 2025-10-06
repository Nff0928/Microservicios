package com.enrollment.enrollment.dto;


import java.time.LocalDate;




public record EnrollmentDto(

    Long id,
    String courseCode,
    String identificationNumber,
    LocalDate enrollmentDate
) {
    
}
