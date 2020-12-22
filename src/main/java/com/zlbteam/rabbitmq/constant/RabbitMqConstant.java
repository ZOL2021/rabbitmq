package com.zlbteam.rabbitmq.constant;

/**
 * @author zhoulibin
 */
public class RabbitMqConstant {

    public static final String DIRECT_EXCHANGE_NAME = "direct.exchange";
    public static final String DIRECT_QUEUE_NAME = "direct.queue";
    public static final String DIRECT_ROUTER_NAME = "direct.router";

    public static final String FANOUT_EXCHANGE_NAME = "fanout.exchange";
    public static final String FIRST_FANOUT_QUEUE_NAME = "first.fanout.queue";
    public static final String SECOND_FANOUT_QUEUE_NAME = "second.fanout.queue";

    public static final String TOPIC_EXCHANGE_NAME = "topic.exchange";
    public static final String FIRST_TOPIC_QUEUE_NAME = "first.topic.queue";
    public static final String SECOND_TOPIC_QUEUE_NAME = "second.topic.queue";
    public static final String THIRD_TOPIC_QUEUE_NAME = "third.topic.queue";
    public static final String FIRST_TOPIC_ROUTER_NAME = "first.topic";
    public static final String SECOND_TOPIC_ROUTER_NAME = "second.topic";
    public static final String THIRD_TOPIC_ROUTER_NAME = "third.topic";

    public static final String HEADERS_EXCHANGE_NAME = "headers.exchange";
    public static final String FIRST_HEADERS_QUEUE_NAME = "first.headers.queue";
    public static final String SECOND_HEADERS_QUEUE_NAME = "second.headers.queue";
    public static final String THIRD_HEADERS_QUEUE_NAME = "third.headers.queue";
}
