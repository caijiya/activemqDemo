package com.jms.activemq.mq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer1 {
    // 使用JmsListener配置消费者监听的队列，其中text是接收到的消息
    @JmsListener(destination = "queues")
    public void receiveQueue(String text) {
        System.out.println("Consumer1: " + text);
    }

}
