package com.example.artemisdemo.config;

import org.apache.activemq.artemis.jms.client.ActiveMQJMSConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.connection.CachingConnectionFactory;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class JmsConfig {
    @Bean
    public JmsTemplate jmsTemplate(){
        String finalUrl = "(tcp://localhost:61616)";
        JmsTemplate jmsTemplate = new JmsTemplate(
                new CachingConnectionFactory(new ActiveMQJMSConnectionFactory(finalUrl)));

        return jmsTemplate;
    }
}
