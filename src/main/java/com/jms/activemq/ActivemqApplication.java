package com.jms.activemq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.jms.activemq.mapper"})
public class ActivemqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActivemqApplication.class, args);
    }
}
