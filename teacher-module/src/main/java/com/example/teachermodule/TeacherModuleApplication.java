package com.example.teachermodule;

import com.example.Child2.config.AutoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import(AutoConfig.class)
public class TeacherModuleApplication {
    public static void main(String[] args) {
        SpringApplication.run(TeacherModuleApplication.class, args);
    }
}
