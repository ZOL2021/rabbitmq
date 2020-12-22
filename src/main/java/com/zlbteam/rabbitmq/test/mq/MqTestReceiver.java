package com.zlbteam.rabbitmq.test.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "test0")
public class MqTestReceiver {
    @RabbitHandler
    public void process(String msg) {
        System.out.println("获取接收信息：" + msg);
    }
}
