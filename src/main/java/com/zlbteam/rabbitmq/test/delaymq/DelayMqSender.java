package com.zlbteam.rabbitmq.test.delaymq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DelayMqSender {
    @Autowired
    AmqpTemplate amqpTemplate;

    public void sendMessage(Integer i) {
        //给延迟队列发送消息
        amqpTemplate.convertAndSend("test2", "test2", i, (MessagePostProcessor) message -> {
            //给消息设置延迟毫秒值
            message.getMessageProperties().setHeader("x-delay", 5000L);
            return message;
        });
    }
}
