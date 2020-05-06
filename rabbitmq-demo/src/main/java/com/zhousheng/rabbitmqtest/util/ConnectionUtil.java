package com.zhousheng.rabbitmqtest.util;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/**
 * 需要咨询java高级VIP课程的同学可以木兰老师的QQ：2746251334
 * 需要往期视频的同学可以加加安其拉老师的QQ：3164703201
 * author：鲁班学院-商鞅老师
 */
public class ConnectionUtil {


    public static final String QUEUE_NAME  = "testQueue";

    public static  final  String EXCHANGE_NAME = "exchange";



    public static Connection getConnection() throws Exception{
        //创建一个连接工厂
        ConnectionFactory connectionFactory = new ConnectionFactory();
        //设置rabbitmq 服务端所在地址 我这里在本地就是本地
        connectionFactory.setHost("127.0.0.1");
        //设置端口号，连接用户名，虚拟地址等
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("henry");
        connectionFactory.setPassword("henry");
        connectionFactory.setVirtualHost("testhost");
        return connectionFactory.newConnection();
    }



}
