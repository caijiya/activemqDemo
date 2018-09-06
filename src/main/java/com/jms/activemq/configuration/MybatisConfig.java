package com.jms.activemq.configuration;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MybatisConfig {

    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        return (org.apache.ibatis.session.Configuration configuration) -> {
            configuration.setMapUnderscoreToCamelCase(true);
        };
    }
}
