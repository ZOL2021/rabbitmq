package com.zlbteam.rabbitmq.publisher;

import com.zlbteam.rabbitmq.constant.RabbitMqConstant;
import com.zlbteam.rabbitmq.dto.RabbitMqDTO;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author zhoulibin
 */
@Component
public class FanoutPublisher {
    @Resource
    private AmqpTemplate amqpTemplate;

    /**
     * 发布广播消息
     */
    public void fanoutSend(RabbitMqDTO rabbitMqDTO) {
        amqpTemplate.convertAndSend(RabbitMqConstant.FANOUT_EXCHANGE_NAME, null, rabbitMqDTO.toString());
    }

    public void firstFanoutSend(RabbitMqDTO rabbitMqDTO) {
        amqpTemplate.convertAndSend(RabbitMqConstant.FANOUT_EXCHANGE_NAME, RabbitMqConstant.FIRST_FANOUT_QUEUE_NAME, rabbitMqDTO.toString());
    }

    public void secondFanoutSend(RabbitMqDTO rabbitMqDTO) {
        amqpTemplate.convertAndSend(RabbitMqConstant.FANOUT_EXCHANGE_NAME, RabbitMqConstant.SECOND_FANOUT_QUEUE_NAME, rabbitMqDTO.toString());
    }
}
