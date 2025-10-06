package com.students.students.service;

import com.students.students.dto.StudentDto;


public interface StudentService {

    StudentDto saveStudent(StudentDto studentdto);

    StudentDto findByIdentificationNumber(String identificationNumber);
    
}
