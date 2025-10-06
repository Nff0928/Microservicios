package com.enrollment.enrollment.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.enrollment.enrollment.dto.EnrollmentDto;
import com.enrollment.enrollment.entity.Enrollment;
import com.enrollment.enrollment.mapper.EnrollmentMapper;
import com.enrollment.enrollment.repository.EnrollmentRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class EnrollmentServiceImpl implements EnrollmentService {


    private final EnrollmentRepository enrollmentRepository;
    private final ModelMapper modelMapper;


    @Override
    public EnrollmentDto saveEnrollment(EnrollmentDto enrollmentDto) {
        return EnrollmentMapper.toDto(enrollmentRepository.save(modelMapper.map(enrollmentDto, Enrollment.class)));
    }

    @Override
    public EnrollmentDto findById(Long id) {
        return EnrollmentMapper.toDto(enrollmentRepository.findById(id).get());
    }

   
    
}
