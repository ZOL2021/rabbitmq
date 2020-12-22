package com.zlbteam.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author zhoulibin
 */
@Component
@RabbitListener(queues = "second.fanout.queue")
public class SecondFanoutConsumer {

    @RabbitHandler
    public void secondFanoutHandle(String message) {
        System.out.println("RabbitMQ 信息:" + message);
    }
}
