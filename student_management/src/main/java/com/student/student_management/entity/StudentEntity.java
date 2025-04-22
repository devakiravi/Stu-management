package com.student.student_management.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@AllArgsConstructor
@Document(value = "EMPLOYEE")
public class StudentEntity {
    @Id
    private int id;
    private int age;
    private String course;
    private String email;
    private String name;
    private String phoneNo;
    private int  rollNo;
}
