package com.example.studentmodule.controller;

import com.example.studentmodule.model.Student;
import com.example.studentmodule.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Alamin Hossain
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    /**
     * Test method to check controller level access
     *
     * @return String
     */
    @GetMapping("/studentInfo")
    public String getStudentInfo() {
        return "Student Controller called and " + studentService.StudentInfo("Alamin");
    }

    /**
     * Create Student
     *
     * @param student student
     * @return String
     */
    @PostMapping("/create")
    public String createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    /**
     * Get All Student information
     *
     * @return List of Student
     */
    @GetMapping("/all")
    public List<Student> getAllStudentInfo() {
        return studentService.getAllStudentInformation();
    }

    /**
     * Get student by teacher name
     *
     * @param teacherName teacher name
     * @return List of Student information
     */
    @GetMapping("/studentByTeacherName/{teacherName}")
    public List<Student> getStudentByTeacherName(@PathVariable("teacherName") String teacherName) {
        return studentService.getStudentByTeacherName(teacherName);
    }
}
