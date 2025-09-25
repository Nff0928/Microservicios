package com.students.students.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.students.students.entity.Student;
import com.students.students.service.StudentService;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@RestController
@RequestMapping("/api/students")
public class StudentController {
    
    private final StudentService studentService;


    @PostMapping
    public Student save (@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/identification-number/{identification}")
    public Student FindByIdentificationNumber(@PathVariable("identification") String identificationNumber) {
        return studentService.findByIdentificationNumber(identificationNumber);
    }

}
