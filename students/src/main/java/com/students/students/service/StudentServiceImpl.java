package com.students.students.service;

import org.springframework.stereotype.Service;

import com.students.students.entity.Student;
import com.students.students.repository.StudentRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class StudentServiceImpl  implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findByIdentificationNumber(String identificationNumber) {
       return studentRepository.findByIdentificationNumber(identificationNumber);
    }

    
    
}
