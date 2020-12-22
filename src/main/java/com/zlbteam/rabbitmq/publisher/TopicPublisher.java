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
public class TopicPublisher {
    @Resource
    private AmqpTemplate amqpTemplate;

    /**
     * 发布主题消息
     */
    public void firstTopicSend(RabbitMqDTO rabbitMqDTO) {
        amqpTemplate.convertAndSend(RabbitMqConstant.TOPIC_EXCHANGE_NAME, RabbitMqConstant.FIRST_TOPIC_ROUTER_NAME + ".1", rabbitMqDTO.toString());
        amqpTemplate.convertAndSend(RabbitMqConstant.TOPIC_EXCHANGE_NAME, RabbitMqConstant.FIRST_TOPIC_ROUTER_NAME + ".2", rabbitMqDTO.toString());
        amqpTemplate.convertAndSend(RabbitMqConstant.TOPIC_EXCHANGE_NAME, RabbitMqConstant.FIRST_TOPIC_ROUTER_NAME + ".3", rabbitMqDTO.toString());
        amqpTemplate.convertAndSend(RabbitMqConstant.TOPIC_EXCHANGE_NAME, RabbitMqConstant.FIRST_TOPIC_ROUTER_NAME + "4", rabbitMqDTO.toString());
    }

    public void secondTopicSend(RabbitMqDTO rabbitMqDTO) {
        amqpTemplate.convertAndSend(RabbitMqConstant.TOPIC_EXCHANGE_NAME, RabbitMqConstant.SECOND_TOPIC_ROUTER_NAME + ".11", rabbitMqDTO.toString());
        amqpTemplate.convertAndSend(RabbitMqConstant.TOPIC_EXCHANGE_NAME, RabbitMqConstant.SECOND_TOPIC_ROUTER_NAME + ".22", rabbitMqDTO.toString());
        amqpTemplate.convertAndSend(RabbitMqConstant.TOPIC_EXCHANGE_NAME, RabbitMqConstant.SECOND_TOPIC_ROUTER_NAME + ".33", rabbitMqDTO.toString());
        amqpTemplate.convertAndSend(RabbitMqConstant.TOPIC_EXCHANGE_NAME, RabbitMqConstant.SECOND_TOPIC_ROUTER_NAME + "44", rabbitMqDTO.toString());
    }

    public void thirdTopicSend(RabbitMqDTO rabbitMqDTO) {
        amqpTemplate.convertAndSend(RabbitMqConstant.TOPIC_EXCHANGE_NAME, "1." + RabbitMqConstant.THIRD_TOPIC_ROUTER_NAME + ".1", rabbitMqDTO.toString());
        amqpTemplate.convertAndSend(RabbitMqConstant.TOPIC_EXCHANGE_NAME, "2." + RabbitMqConstant.THIRD_TOPIC_ROUTER_NAME + ".2", rabbitMqDTO.toString());
        amqpTemplate.convertAndSend(RabbitMqConstant.TOPIC_EXCHANGE_NAME, "3." + RabbitMqConstant.THIRD_TOPIC_ROUTER_NAME + ".3", rabbitMqDTO.toString());
        amqpTemplate.convertAndSend(RabbitMqConstant.TOPIC_EXCHANGE_NAME, "4" + RabbitMqConstant.THIRD_TOPIC_ROUTER_NAME + ".4", rabbitMqDTO.toString());
    }
}
