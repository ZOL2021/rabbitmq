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
public class DirectPublisher {
    @Resource
    private AmqpTemplate amqpTemplate;

    /**
     * 发布直连消息
     */
    public void directSend(RabbitMqDTO rabbitMqDTO) {
        amqpTemplate.convertAndSend(RabbitMqConstant.DIRECT_QUEUE_NAME, rabbitMqDTO.toString());
    }
}
