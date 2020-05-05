package com.zhousheng.rabbitmqtest.producer;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.zhousheng.rabbitmqtest.util.ConnectionUtil;

public class Producer {
    public static void sendByExchange(String message) throws Exception {

        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        //声明队列
        channel.queueDeclare(ConnectionUtil.QUEUE_NAME, true, false, false, null);
        // 声明exchange
        channel.exchangeDeclare(ConnectionUtil.EXCHANGE_NAME, "fanout");
        //交换机和队列绑定
        channel.queueBind(ConnectionUtil.QUEUE_NAME, ConnectionUtil.EXCHANGE_NAME, "");
        channel.basicPublish(ConnectionUtil.EXCHANGE_NAME, "", null, message.getBytes());
        System.out.println("发送的信息为:" + message);
        channel.close();
        connection.close();
    }


    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; i++) {
            Thread.sleep(400);
            Producer.sendByExchange("this is the message that i want to pass to you !"+i);
        }


    }
}
