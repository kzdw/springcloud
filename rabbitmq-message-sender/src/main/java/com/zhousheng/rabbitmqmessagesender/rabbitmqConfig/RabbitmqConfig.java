package com.zhousheng.rabbitmqmessagesender.rabbitmqConfig;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConfig {
    @Bean
    public DirectExchange defaultExchange() {
        return new DirectExchange("directExchangeLily");
    }

    @Bean
    public Queue queue() {
        //名字  是否持久化
        return new Queue("testQueueLily", true);
    }

    @Bean
    public Binding binding() {
        //绑定一个队列  to: 绑定到哪个交换机上面 with：绑定的路由建（routingKey）
        return BindingBuilder.bind(queue()).to(defaultExchange()).with("studentInfoLily");
    }
}
