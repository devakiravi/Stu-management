package com.student.student_management.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class StudentDTO {
    private int age;
    private String course;
    private String email;
    private String name;
    private String phoneNo;
    private int  rollNo;


}
