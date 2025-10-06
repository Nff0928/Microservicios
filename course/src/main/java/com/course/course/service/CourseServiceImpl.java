package com.course.course.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.course.course.config.CourseMapper;
import com.course.course.dto.CourseDTO;
import com.course.course.entity.Course;
import com.course.course.repository.CourseRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CourseServiceImpl implements CourseService {


    private final CourseRepository courseRepository;

    private final ModelMapper modelMapper;


    @Override
    public CourseDTO saveCourse(CourseDTO courseDTO) {
        return CourseMapper.toDTO(courseRepository.save(modelMapper.map(courseDTO, Course.class)));        
    }

    @Override
    public CourseDTO findByCourseCode(String courseCode) {
        return  CourseMapper.toDTO(courseRepository.findByCourseCode(courseCode));
    }
    
}
