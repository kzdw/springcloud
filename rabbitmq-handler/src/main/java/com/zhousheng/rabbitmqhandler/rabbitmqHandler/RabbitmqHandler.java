package com.zhousheng.rabbitmqhandler.rabbitmqHandler;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitmqHandler {

    @RabbitListener(queues = "testQueueLily")
    public void get(String message) throws Exception{
        System.out.println(message);
    }

}
