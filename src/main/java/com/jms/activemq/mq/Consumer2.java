package com.jms.activemq.mq;

import com.alibaba.fastjson.JSONObject;
import com.jms.activemq.entity.User;
import com.jms.activemq.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class Consumer2 {
    @Autowired
    UserMapper userMapper;

    // 使用JmsListener配置消费者监听的队列，其中text是接收到的消息
    @JmsListener(destination = "queue")
    @SendTo(value = "out.queue")
    public String receiveQueue(String text) {
        System.out.println("Consumer2: " + text);
        User user = JSONObject.parseObject(text, User.class);
        int ret = userMapper.save(user);
        System.out.println("ret: " + ret);
        if (ret > 0) {
            return "success";
        }
        return "fail";
    }

}
