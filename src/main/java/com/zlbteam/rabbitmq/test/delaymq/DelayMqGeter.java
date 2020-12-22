package com.zlbteam.rabbitmq.test.delaymq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author zhoulibin
 */
@Component
@RabbitListener(queues = "test2")
public class DelayMqGeter {

    @RabbitHandler
    public void handle(Integer i){
        if(AutoE.getInteger() == 2) {
            System.out.println(i + "取消操作信息：："+ AutoE.getInteger());
        }else{
            System.out.println(i + "丢弃该信息："+ AutoE.getInteger());
        }
    }
}
