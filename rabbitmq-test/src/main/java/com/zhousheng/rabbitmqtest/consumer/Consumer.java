package com.zhousheng.rabbitmqtest.consumer;

import com.rabbitmq.client.*;
import com.zhousheng.rabbitmqtest.util.ConnectionUtil;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Consumer {
    public static void getMessage() throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
//        channel.queueDeclare(ConnectionUtil.QUEUE_NAME,true,false,false,null);
        DefaultConsumer deliverCallback = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException, UnsupportedEncodingException {
                System.out.println(new String(body, "UTF-8"));
                System.out.println("消息消费成功");
                channel.basicAck(envelope.getDeliveryTag(),false);
            }
        };
        channel.basicConsume(ConnectionUtil.QUEUE_NAME, false,deliverCallback);
    }

    public static void main(String[] args) throws Exception {
        Consumer.getMessage();
    }

}
