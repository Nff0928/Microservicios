package com.students.students.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.students.students.dto.StudentDto;
import com.students.students.entity.Student;
import com.students.students.mapper.StudentMapper;
import com.students.students.repository.StudentRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class StudentServiceImpl  implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;


    @Override
    public StudentDto saveStudent(StudentDto studentdto) {
        //Student student = modelMapper.map(studentdto, Student.class);
        //Student studentDB = studentRepository.save(student);
        //StudentDto dto = StudentMapper.toDto(studentDB);

        return StudentMapper.toDto(studentRepository.save(modelMapper.map(studentdto, Student.class)));
    }
    @Override
    public StudentDto findByIdentificationNumber(String identificationNumber) {
       //Student studentDB = studentRepository.findByIdentificationNumber(identificationNumber);
       //StudentDto studentDto = StudentMapper.toDto(studentDB);
         return StudentMapper.toDto(studentRepository.findByIdentificationNumber(identificationNumber));
    }

    
    
}
