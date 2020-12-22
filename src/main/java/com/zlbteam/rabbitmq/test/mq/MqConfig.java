package com.zlbteam.rabbitmq.test.mq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MqConfig {
    @Bean
    public Queue test0() {
        return new Queue("test0",true);
    }
}
