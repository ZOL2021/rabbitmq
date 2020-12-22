package com.zlbteam.rabbitmq.config;

import com.zlbteam.rabbitmq.constant.RabbitMqConstant;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhoulibin
 */
@Configuration
public class RabbitMqConfig {
    /**
     * 直连
     */
    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange(RabbitMqConstant.DIRECT_EXCHANGE_NAME,true,false);
    }

    @Bean
    public Queue directQueue() {
        return new Queue(RabbitMqConstant.DIRECT_QUEUE_NAME,true);
    }

    @Bean
    public Binding directBing() {
        return BindingBuilder.bind(directQueue()).to(directExchange()).with(RabbitMqConstant.DIRECT_ROUTER_NAME);
    }

    /**
     * 广播
     */
    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange(RabbitMqConstant.FANOUT_EXCHANGE_NAME,true,false);
    }

    @Bean
    public Queue firstFanoutQueue() {
        return new Queue(RabbitMqConstant.FIRST_FANOUT_QUEUE_NAME,true);
    }

    @Bean
    public Queue secondFanoutQueue() {
        return new Queue(RabbitMqConstant.SECOND_FANOUT_QUEUE_NAME,true);
    }

    @Bean
    public Binding firstFanoutBing() {
        return BindingBuilder.bind(firstFanoutQueue()).to(fanoutExchange());
    }

    @Bean
    public Binding secondFanoutBing() {
        return BindingBuilder.bind(secondFanoutQueue()).to(fanoutExchange());
    }

    /**
     * 主题
     */
    @Bean
    public TopicExchange topicExchange() {
        return new TopicExchange(RabbitMqConstant.TOPIC_EXCHANGE_NAME,true,false);
    }

    @Bean
    public Queue firstTopicQueue() {
        return new Queue(RabbitMqConstant.FIRST_TOPIC_QUEUE_NAME,true);
    }

    @Bean
    public Queue secondTopicQueue() {
        return new Queue(RabbitMqConstant.SECOND_TOPIC_QUEUE_NAME,true);
    }

    @Bean
    public Queue thirdTopicQueue() {
        return new Queue(RabbitMqConstant.THIRD_TOPIC_QUEUE_NAME,true);
    }

    @Bean
    public Binding firstTopicBing() {
        return BindingBuilder.bind(firstTopicQueue()).to(topicExchange()).with(RabbitMqConstant.FIRST_TOPIC_ROUTER_NAME + ".*");
    }

    @Bean
    public Binding secondTopicBing() {
        return BindingBuilder.bind(secondTopicQueue()).to(topicExchange()).with(RabbitMqConstant.SECOND_TOPIC_ROUTER_NAME + ".#");
    }

    @Bean
    public Binding thirdTopicBing() {
        return BindingBuilder.bind(thirdTopicQueue()).to(topicExchange()).with("#."+ RabbitMqConstant.THIRD_TOPIC_ROUTER_NAME + ".#");
    }

    /**
     * 消息头
     */
    @Bean
    public HeadersExchange headersExchange() {
        return new HeadersExchange(RabbitMqConstant.HEADERS_EXCHANGE_NAME,true,false);
    }

    @Bean
    public Queue firstHeadersQueue() {
        return new Queue(RabbitMqConstant.FIRST_HEADERS_QUEUE_NAME,true);
    }

    @Bean
    public Queue secondHeadersQueue() {
        return new Queue(RabbitMqConstant.SECOND_HEADERS_QUEUE_NAME,true);
    }

    @Bean
    public Queue thirdHeadersQueue() {
        return new Queue(RabbitMqConstant.THIRD_HEADERS_QUEUE_NAME,true);
    }

    @Bean
    public Binding firstHeadersBing() {
        return BindingBuilder.bind(firstHeadersQueue()).to(headersExchange()).where("name").exists();
    }

    @Bean
    public Binding secondHeadersBing() {
        return BindingBuilder.bind(secondHeadersQueue()).to(headersExchange()).whereAny("key","value").exist();
    }

    @Bean
    public Binding thirdHeadersBing() {
        return BindingBuilder.bind(thirdHeadersQueue()).to(headersExchange()).whereAll("key","value").exist();
    }

    //
    //CustomExchange
}
