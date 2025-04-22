package com.student.student_management.service;

import com.student.student_management.dto.StudentDTO;
import com.student.student_management.entity.StudentEntity;
import com.student.student_management.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public ResponseEntity<Void> create (StudentDTO studentDTO) {

       StudentEntity studentEntity = StudentEntity.builder()
               .age(studentDTO.getAge())
               .name(studentDTO.getName())
               .email(studentDTO.getEmail())
               .course(studentDTO.getCourse())
               .phoneNo(studentDTO.getPhoneNo())
               .rollNo(studentDTO.getRollNo())
                .build();

        studentRepository.save(studentEntity);
        return ResponseEntity.ok().build();
    }
    
}
