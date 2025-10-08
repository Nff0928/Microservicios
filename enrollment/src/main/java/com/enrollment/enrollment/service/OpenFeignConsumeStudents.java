package com.enrollment.enrollment.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.enrollment.enrollment.dto.StudentDto;

@FeignClient(url = "http://localhost:8080/api/students", value =  "Students")
public interface OpenFeignConsumeStudents {

    @GetMapping("/identification-number/{identification}")
    public StudentDto FindByIdentificationNumber(@PathVariable("identification") String identificationNumber);

    
} 
