package com.example.teachermodule.repository;

import com.example.teachermodule.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Alamin Hossain
 */
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
