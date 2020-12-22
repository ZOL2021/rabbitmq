package com.zlbteam.rabbitmq.dto;

/**
 * @author zhoulibin
 */
public class RabbitMqDTO {
    private String id;
    private String sign;
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "RabbitMqDTO{" +
                "id='" + id + '\'' +
                ", sign='" + sign + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
