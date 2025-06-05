package com.Crud_Operations.springbootbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {
    @GetMapping("/")
    public String home() {
        return "Welcome to the Basic CRUD Operations API!";
    }
}
