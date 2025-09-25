package com.students.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.students.students.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    
    Student findByIdentificationNumber(String identificationNumber);
    
}
