package com.example.teachermodule.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Configuration of Teacher Module
 * Import other modules component, entity and JpaRepository
 *
 * @author Alamin Hossain
 */
@Configuration
@Import({com.example.Child2.config.AutoConfig.class, com.example.studentmodule.config.AutoConfig.class})
@EntityScan(basePackages = {"com.example.*"})
@EnableJpaRepositories(basePackages = {"com.example.*"})
public class AutoConfig {
}
