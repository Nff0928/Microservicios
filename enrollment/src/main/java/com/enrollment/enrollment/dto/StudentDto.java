package com.enrollment.enrollment.dto;


public record StudentDto(
    Long id,
    String identificationNumber,
    String name,
    String email
) {
    
}
