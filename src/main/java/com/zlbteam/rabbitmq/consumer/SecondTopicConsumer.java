package com.zlbteam.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author zhoulibin
 */
@Component
@RabbitListener(queues = "second.topic.queue")
public class SecondTopicConsumer {

    @RabbitHandler
    public void secondTopicHandle(String message) {
        System.out.println("RabbitMQ 信息:" + message);
    }
}
