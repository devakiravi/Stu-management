package com.student.student_management.repository;

import com.student.student_management.entity.StudentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<StudentEntity,String> {
}
