package com.zlbteam.rabbitmq.test.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MqTestController {

    @Autowired
    private MqTestSend send;

    @RequestMapping("/send")
    public String send() {
        send.send();
        return "OK";
    }
}
