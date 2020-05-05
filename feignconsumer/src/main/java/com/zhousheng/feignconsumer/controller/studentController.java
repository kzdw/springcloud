package com.zhousheng.feignconsumer.controller;


import com.zhousheng.feignconsumer.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {
    @Autowired
    IService service;

    @GetMapping(value = "/findStudent")
    @ResponseBody
    public String studentInfo(){
       return service.findStudent();
    }
}
