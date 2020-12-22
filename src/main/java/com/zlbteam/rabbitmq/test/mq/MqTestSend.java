package com.zlbteam.rabbitmq.test.mq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhoulibin
 */
@Component
public class MqTestSend {
    @Autowired
    private AmqpTemplate template;

    public void send() {
        template.convertAndSend("test0", "this is 信息！");
    }
}
