package com.zhousheng.serverconsumer.controller;


import com.zhousheng.serverconsumer.controller.service.RibbinconsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class RibbinconsumerController {
    @Autowired
    private RibbinconsumerService service;

    @GetMapping(value = "/ribbionFindStudent")
    @ResponseBody
    public String findRibbonConsumer() {
        return service.findRibbonConsumer();
    }

}
