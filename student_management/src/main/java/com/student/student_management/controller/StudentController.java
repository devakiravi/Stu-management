package com.student.student_management.controller;

import com.student.student_management.dto.StudentDTO;
import com.student.student_management.repository.StudentRepository;
import com.student.student_management.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public ResponseEntity <Void> create (@RequestBody StudentDTO studentDTO){
        return studentService.create(studentDTO);
    }
}
