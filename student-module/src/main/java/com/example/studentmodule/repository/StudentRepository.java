package com.example.studentmodule.repository;

import com.example.studentmodule.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Alamin Hossain
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByAssigned(String teacherName);
}
