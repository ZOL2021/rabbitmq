package com.zlbteam.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author zhoulibin
 */
@Component
@RabbitListener(queues = "first.headers.queue")
public class FirstHeadersConsumer {

    @RabbitHandler
    public void firstTopicHandle(byte[] message) {
        System.out.println("RabbitMQ 信息:" + new String (message, 0, message.length));
    }
}
