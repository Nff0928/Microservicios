package com.students.students.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.students.students.dto.StudentDto;
import com.students.students.entity.Student;
import com.students.students.service.StudentService;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@RestController
@RequestMapping("/api/students")
public class StudentController {
    
    private final StudentService studentService;


    @PostMapping
    public StudentDto save (@RequestBody StudentDto studentdto) {
        return studentService.saveStudent(studentdto);
    }

    @GetMapping("/identification-number/{identification}")
    public StudentDto FindByIdentificationNumber(@PathVariable("identification") String identificationNumber) {
        return studentService.findByIdentificationNumber(identificationNumber);
    }

}
