package com.example.teachermodule.repository;

import com.example.Child2.entity.Child2Entity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Alamin Hossain
 */
public interface ChildRepository extends JpaRepository<Child2Entity, Long> {
}
