package com.example.teachermodule.service;

import com.example.Child2.entity.Child2Entity;
import com.example.studentmodule.model.Student;
import com.example.studentmodule.service.StudentService;
import com.example.teachermodule.model.Teacher;
import com.example.teachermodule.repository.ChildRepository;
import com.example.teachermodule.repository.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Alamin Hossain
 */
@Service
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherRepository teacherRepository;
    private final StudentService studentService;
    private final ChildRepository childRepository;

    /**
     * Save Teacher Information
     *
     * @param teacher Teacher
     * @return String
     */
    public String createTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
        return "Teacher Created Successfully";
    }

    /**
     * Get Teacher information by id
     *
     * @param id teacher id
     * @return Teacher
     */
    public Optional<Teacher> getTeacherBYId(Integer id) {
        return teacherRepository.findById(id);
    }

    /**
     * Get all teacher information
     *
     * @return List of teacher
     */
    public List<Teacher> getAllTeacher() {
        return teacherRepository.findAll();
    }

    /**
     * Get student information by teacher name from teacher module
     *
     * @param teacherName teacher name
     * @return List of student information
     */
    public List<Student> getAllStudentByTeacherName(String teacherName) {
        return studentService.getStudentByTeacherName(teacherName);
    }

    /**
     * Create Child lib object
     *
     * @param child2Entity child
     * @return child object
     */
    public Child2Entity createChild(Child2Entity child2Entity) {
        return childRepository.save(child2Entity);
    }

}
