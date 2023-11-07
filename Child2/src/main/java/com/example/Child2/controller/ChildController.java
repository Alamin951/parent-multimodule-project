package com.example.Child2.controller;

import com.example.Child2.service.ChildService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo Child Controller
 *
 * @author Alamin Hossain
 */
@RestController
@RequestMapping("/child")
@RequiredArgsConstructor
public class ChildController {
    private final ChildService childService;
    @GetMapping("/info")
    public String getChildController() {
        return childService.testChildService();
    }
}
