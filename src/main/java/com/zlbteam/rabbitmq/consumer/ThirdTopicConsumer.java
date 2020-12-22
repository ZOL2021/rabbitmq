package com.zlbteam.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author zhoulibin
 */
@Component
@RabbitListener(queues = "third.topic.queue")
public class ThirdTopicConsumer {

    @RabbitHandler
    public void thirdTopicHandle(String message) {
        System.out.println("RabbitMQ 信息:" + message);
    }
}
