package com.zlbteam.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author zhoulibin
 */
@Component
@RabbitListener(queues = "direct.queue")
public class DirectConsumer {
    @RabbitHandler
    public void directHandle(String message) {
        System.out.println("RabbitMQ 信息:" + message);
    }
}
