package com.zhousheng.serverconsumer.controller.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbinconsumerService {
    @Autowired
    RestTemplate template;

    @HystrixCommand(fallbackMethod = "findRibbonConsumerFallback")
    public String findRibbonConsumer() {
        String studentQuery = template.getForObject("http://serverprovider/findStudent", String.class);
        return studentQuery;
    }
    public String findRibbonConsumerFallback() {
        return new String("student not found");
    }
}
