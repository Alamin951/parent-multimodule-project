package com.example.Child2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Test Child lib Service Class
 *
 * @author Alamin Hossain
 */
@Service
@RequiredArgsConstructor
public class ChildService {

    /**
     * Test Service method
     *
     * @return String
     */
    public String testChildService() {
        return "Child service called";
    }
}
