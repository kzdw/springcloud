package com.zhousheng.rabbitmqmessagesender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqMessageSenderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqMessageSenderApplication.class, args);
    }
//除了用配置文件还可以用以下方式进行配置，但是个人觉得还是使用配置文件好些，毕竟可能环境不同配置会不同，而且如果是springcloud项目，如果使用了配置中心
// 的话，需要更改配置就更没有办法了。
//    @Bean
//    public static ConnectionFactory getConnection() {
//        //创建一个连接工厂
//        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
//        //设置rabbitmq 服务端所在地址 我这里在本地就是本地
//        connectionFactory.setHost("127.0.0.1");
//        //设置端口号，连接用户名，虚拟地址等
//        connectionFactory.setPort(5672);
//        connectionFactory.setUsername("guest");
//        connectionFactory.setPassword("guest");
//        connectionFactory.setVirtualHost("testhost");
//        return connectionFactory;
//    }
//
//    @Bean
//    public RabbitTemplate rabbitTemplate(CachingConnectionFactory connectionFactory) {
//        //注意  这个ConnectionFactory 是使用javaconfig方式配置连接的时候才需要传入的  如果是yml配置的连接的话是不需要的
//        RabbitTemplate template = new RabbitTemplate(connectionFactory);
//        return template;
//    }


}
