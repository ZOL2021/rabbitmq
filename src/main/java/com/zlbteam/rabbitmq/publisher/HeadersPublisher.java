package com.zlbteam.rabbitmq.publisher;

import com.zlbteam.rabbitmq.constant.RabbitMqConstant;
import com.zlbteam.rabbitmq.dto.RabbitMqDTO;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author zhoulibin
 */
@Component
public class HeadersPublisher {
    @Resource
    private AmqpTemplate amqpTemplate;

    /**
     * 发布头部消息
     */
    public void firstHeadersSend(RabbitMqDTO rabbitMqDTO) {
        Message message = MessageBuilder.withBody(rabbitMqDTO.toString().getBytes()).setHeader("name", "show").build();
        amqpTemplate.send(RabbitMqConstant.HEADERS_EXCHANGE_NAME, null, message);
    }

    public void secondHeadersSend(RabbitMqDTO rabbitMqDTO) {
        Message message = MessageBuilder.withBody(rabbitMqDTO.toString().getBytes()).setHeader("key", "value").build();
        amqpTemplate.send(RabbitMqConstant.HEADERS_EXCHANGE_NAME, null, message);
    }

    public void message(RabbitMqDTO rabbitMqDTO) {
        Message message = MessageBuilder.withBody(rabbitMqDTO.toString().getBytes()).setHeader("key", "value").setHeader("a", "b").build();
        amqpTemplate.send(RabbitMqConstant.HEADERS_EXCHANGE_NAME, null, message);
    }
}
