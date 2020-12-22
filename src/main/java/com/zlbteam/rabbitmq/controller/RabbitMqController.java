package com.zlbteam.rabbitmq.controller;

import com.zlbteam.rabbitmq.dto.RabbitMqDTO;
import com.zlbteam.rabbitmq.publisher.DirectPublisher;
import com.zlbteam.rabbitmq.publisher.FanoutPublisher;
import com.zlbteam.rabbitmq.publisher.HeadersPublisher;
import com.zlbteam.rabbitmq.publisher.TopicPublisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhoulibin
 */
@RestController
public class RabbitMqController {
    @Resource
    DirectPublisher directPublisher;

    @Resource
    FanoutPublisher fanoutPublisher;

    @Resource
    TopicPublisher topicPublisher;

    @Resource
    HeadersPublisher headersPublisher;

    @ResponseBody
    @RequestMapping("/direct")
    public String direct() {
        RabbitMqDTO rabbitMqDTO = new RabbitMqDTO();
        rabbitMqDTO.setId("show-id: 0001");
        rabbitMqDTO.setSign("show-sign: 0001");
        rabbitMqDTO.setContent("show-content: this is direct message");
        directPublisher.directSend(rabbitMqDTO);
        return "OK";
    }

    @ResponseBody
    @RequestMapping("/fanout")
    public String fanout() {
        RabbitMqDTO rabbitMqDTO = new RabbitMqDTO();
        rabbitMqDTO.setId("show-id: 0001");
        rabbitMqDTO.setSign("show-sign: 0001");
        rabbitMqDTO.setContent("show-content: this is direct message");
        fanoutPublisher.fanoutSend(rabbitMqDTO);
        return "OK";
    }

    @ResponseBody
    @RequestMapping("/fanout1")
    public String fanout1() {
        RabbitMqDTO rabbitMqDTO = new RabbitMqDTO();
        rabbitMqDTO.setId("show-id: 0001");
        rabbitMqDTO.setSign("show-sign: 0001");
        rabbitMqDTO.setContent("show-content: this is direct message");
        fanoutPublisher.firstFanoutSend(rabbitMqDTO);
        return "OK";
    }

    @ResponseBody
    @RequestMapping("/fanout2")
    public String fanout2() {
        RabbitMqDTO rabbitMqDTO = new RabbitMqDTO();
        rabbitMqDTO.setId("show-id: 0002");
        rabbitMqDTO.setSign("show-sign: 0002");
        rabbitMqDTO.setContent("show-content: this is direct message");
        fanoutPublisher.secondFanoutSend(rabbitMqDTO);
        return "OK";
    }

    @ResponseBody
    @RequestMapping("/topic1")
    public String topic1() {
        RabbitMqDTO rabbitMqDTO = new RabbitMqDTO();
        rabbitMqDTO.setId("show-id: 0003");
        rabbitMqDTO.setSign("show-sign: 0003");
        rabbitMqDTO.setContent("show-content: this is direct message");
        topicPublisher.firstTopicSend(rabbitMqDTO);
        return "OK";
    }

    @ResponseBody
    @RequestMapping("/topic2")
    public String topic2() {
        RabbitMqDTO rabbitMqDTO = new RabbitMqDTO();
        rabbitMqDTO.setId("show-id: 0004");
        rabbitMqDTO.setSign("show-sign: 0004");
        rabbitMqDTO.setContent("show-content: this is direct message");
        topicPublisher.secondTopicSend(rabbitMqDTO);
        return "OK";
    }

    @ResponseBody
    @RequestMapping("/topic3")
    public String topic3() {
        RabbitMqDTO rabbitMqDTO = new RabbitMqDTO();
        rabbitMqDTO.setId("show-id: 0005");
        rabbitMqDTO.setSign("show-sign: 0005");
        rabbitMqDTO.setContent("show-content: this is direct message");
        topicPublisher.thirdTopicSend(rabbitMqDTO);
        return "OK";
    }

    @ResponseBody
    @RequestMapping("/headers1")
    public String headers1() {
        RabbitMqDTO rabbitMqDTO = new RabbitMqDTO();
        rabbitMqDTO.setId("show-id: 0006");
        rabbitMqDTO.setSign("show-sign: 0006");
        rabbitMqDTO.setContent("show-content: this is direct message");
        headersPublisher.firstHeadersSend(rabbitMqDTO);
        return "OK";
    }

    @ResponseBody
    @RequestMapping("/headers2")
    public String headers2() {
        RabbitMqDTO rabbitMqDTO = new RabbitMqDTO();
        rabbitMqDTO.setId("show-id: 0007");
        rabbitMqDTO.setSign("show-sign: 0007");
        rabbitMqDTO.setContent("show-content: this is direct message");
        headersPublisher.firstHeadersSend(rabbitMqDTO);
        return "OK";
    }

    @ResponseBody
    @RequestMapping("/headers3")
    public String headers3() {
        RabbitMqDTO rabbitMqDTO = new RabbitMqDTO();
        rabbitMqDTO.setId("show-id: 0008");
        rabbitMqDTO.setSign("show-sign: 0008");
        rabbitMqDTO.setContent("show-content: this is direct message");
        headersPublisher.firstHeadersSend(rabbitMqDTO);
        return "OK";
    }
}
