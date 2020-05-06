package com.zhousheng.rabbitmqmessagesender.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @GetMapping(value = "/sender")
    @ResponseBody
    public void sendMessage() {
        rabbitTemplate.convertAndSend( "directExchangeLily","studentInfoLily", "this is a message");
    }
}
