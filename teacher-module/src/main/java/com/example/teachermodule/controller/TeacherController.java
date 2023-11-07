package com.example.teachermodule.controller;

import com.example.Child2.entity.Child2Entity;
import com.example.studentmodule.controller.StudentController;
import com.example.studentmodule.model.Student;
import com.example.studentmodule.service.StudentService;
import com.example.teachermodule.model.Teacher;
import com.example.teachermodule.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Alamin Hossain
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/teacher")
public class TeacherController {
    private final StudentController studentController;
    private final StudentService studentService;

    private final TeacherService teacherService;

    /**
     * Test Controller access
     *
     * @return string
     */
    @GetMapping("/info")
    public String getTeacherInfo() {
        return "Teacher Controller " + studentController.getStudentInfo();
    }

    /**
     * Save Student Information
     *
     * @param teacher Teacher
     * @return String
     */
    @PostMapping("/create")
    public String createTeacher(@RequestBody Teacher teacher) {

        return teacherService.createTeacher(teacher);
    }

    /**
     * Get Teacher Information
     *
     * @param id teacher if
     * @return Teacher
     */
    @GetMapping("/{teacherId}")
    public Optional<Teacher> getUser(@PathVariable("teacherId") Integer id) {
        return teacherService.getTeacherBYId(id);
    }

    /**
     * Get all teacher information
     *
     * @return list of Teacher
     */
    @GetMapping("/all")
    public List<Teacher> getAllTeacher() {
        return teacherService.getAllTeacher();
    }

    /**
     * Create Student by Teacher Module
     *
     * @param student Student
     * @return String
     */
    @PostMapping("/createStudent")
    public String setStudentInformation(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    /**
     * Create Lib object by Teacher module
     *
     * @param child2Entity Child .
     * @return Child
     */
    @PostMapping("/CreateUserLib")
    public Child2Entity createChild2(@RequestBody Child2Entity child2Entity) {
        return teacherService.createChild(child2Entity);
    }
}
