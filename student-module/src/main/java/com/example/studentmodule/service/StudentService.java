package com.example.studentmodule.service;

import com.example.studentmodule.model.Student;
import com.example.studentmodule.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Alamin Hossain
 */
@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    /**
     * Demo service method to check the access
     *
     * @param name name
     * @return string
     */
    public String StudentInfo(String name) {
        return "Student name is: " + name;
    }

    /**
     * Save Student Information
     *
     * @param student student
     * @return String
     */
    public String createStudent(Student student) {
        studentRepository.save(student);

        return "Student Information saved!!!";
    }

    /**
     * Get Student Information by teacher name
     *
     * @param teacherName teacher name
     * @return List of student information
     */
    public List<Student> getStudentByTeacherName(String teacherName) {
        return studentRepository.findByAssigned(teacherName);
    }

    /**
     * Get Student information by id
     *
     * @param id student id
     * @return student
     */
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).orElseThrow();
    }

    /**
     * Get all student information
     *
     * @return list of Student information
     */
    public List<Student> getAllStudentInformation() {
        return studentRepository.findAll();
    }
}
