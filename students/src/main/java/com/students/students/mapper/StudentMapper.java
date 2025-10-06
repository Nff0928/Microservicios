package com.students.students.mapper;

import com.students.students.dto.StudentDto;
import com.students.students.entity.Student;

public class StudentMapper {

    public static StudentDto toDto(Student student) {
        return new StudentDto(
            student.getId(),
            student.getIdentificationNumber(),
            student.getName(),
            student.getEmail()
        );
    }
    
}
