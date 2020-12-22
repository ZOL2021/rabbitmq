package com.zlbteam.rabbitmq.test.delaymq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DelayMqTestController {

    @Autowired
    private DelayMqSender send;

    @RequestMapping("/send2")
    public String send() {
        AutoE.setInteger(1);
        send.sendMessage(0);
        return "OK";
    }

    @RequestMapping("/down")
    public String down() {
        AutoE.setInteger(2);
        return "Exchange!";
    }
}
