package com.students.students.service;

import com.students.students.entity.Student;

public interface StudentService {

    Student saveStudent(Student student);

    Student findByIdentificationNumber(String identificationNumber);
    
}
