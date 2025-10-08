package com.enrollment.enrollment.service;

import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.enrollment.enrollment.dto.CourseDTO;
import com.enrollment.enrollment.dto.EnrollmentDto;
import com.enrollment.enrollment.dto.EnrollmentResponseDto;
import com.enrollment.enrollment.dto.StudentDto;
import com.enrollment.enrollment.entity.Enrollment;
import com.enrollment.enrollment.mapper.EnrollmentMapper;
import com.enrollment.enrollment.repository.EnrollmentRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class EnrollmentServiceImpl implements EnrollmentService {


    private final EnrollmentRepository enrollmentRepository;
    private final ModelMapper modelMapper;
    private final OpenFeignConsumeStudents openFeignConsumeStudents;
    private final OpenFeignConsumeCourse openFeignConsumeCourse;
    //private final WebClient webClient;
    //private final RestTemplate  restTemplate;

    @Override
    public EnrollmentDto saveEnrollment(EnrollmentDto enrollmentDto) {
        return EnrollmentMapper.toDto(enrollmentRepository.save(modelMapper.map(enrollmentDto, Enrollment.class)));
    }

    @Override
    public EnrollmentResponseDto findById(Long id) {
        
        //Asi se usa con openFeign
        Enrollment enrollmentDB = enrollmentRepository.findById(id).get();



        StudentDto studentDto = openFeignConsumeStudents.FindByIdentificationNumber(enrollmentDB.getIdentificationNumber());
        CourseDTO courseDTO = openFeignConsumeCourse.findByCourseCode(enrollmentDB.getCourseCode());
        
        EnrollmentDto enrollmentDto = EnrollmentMapper.toDto(enrollmentDB);
        return new EnrollmentResponseDto(enrollmentDto, courseDTO, studentDto);


        //Asi se usa con webClient
        /*Enrollment enrollmentDB = enrollmentRepository.findById(id).get();

        StudentDto studentDto = webClient.get()
            .uri("http://localhost:8080/api/students/identification-number/{identificationNumber}", enrollmentDB.getIdentificationNumber())
            .retrieve()
            .bodyToMono(StudentDto.class)
            .block();

            CourseDTO courseDTO = webClient.get()
            .uri("http://localhost:9090/api/courses/course/{courseCode}", enrollmentDB.getCourseCode())
            .retrieve()
            .bodyToMono(CourseDTO.class)
            .block();


        EnrollmentDto enrollmentDto = EnrollmentMapper.toDto(enrollmentDB);
        return new EnrollmentResponseDto(enrollmentDto, courseDTO, studentDto);
        */

        // asi se usa con restTemplate
        //return EnrollmentMapper.toDto(enrollmentRepository.findById(id).get());
        /*Enrollment enrollmentDB = enrollmentRepository.findById(id).get();

        ResponseEntity<StudentDto> studentDTOResponseEntity = restTemplate.getForEntity(
            "http://localhost:8080/api/students/identification-number/"+ enrollmentDB.getIdentificationNumber(),StudentDto.class);

        ResponseEntity<CourseDTO> courseDTOResponseEntity = restTemplate.getForEntity(
            "http://localhost:9090/api/courses/course/"+ enrollmentDB.getCourseCode(),CourseDTO.class);

        EnrollmentDto enrollmentDto = EnrollmentMapper.toDto(enrollmentDB);
        CourseDTO courseDTO = courseDTOResponseEntity.getBody();
        StudentDto studentDto = studentDTOResponseEntity.getBody();
       
        return new EnrollmentResponseDto(enrollmentDto, courseDTO, studentDto);
        */





    }



   
    
}
