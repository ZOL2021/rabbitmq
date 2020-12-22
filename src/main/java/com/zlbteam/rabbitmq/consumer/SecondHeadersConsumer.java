package com.zlbteam.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author zhoulibin
 */
@Component
@RabbitListener(queues = "second.headers.queue")
public class SecondHeadersConsumer {

    @RabbitHandler
    public void secondTopicHandle(byte[] message) {
        System.out.println("RabbitMQ 信息:" + new String (message, 0, message.length));
    }
}
