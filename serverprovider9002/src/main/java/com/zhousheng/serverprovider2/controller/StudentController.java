package com.zhousheng.serverprovider2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController()
public class StudentController {
    @GetMapping(value = "/findStudent")
    @ResponseBody
    public String studentInfo() {
        return "I am a student1";
    }
}
