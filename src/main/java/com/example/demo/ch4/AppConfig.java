package com.example.demo.ch4;

import com.example.demo.ch3.MessageProvider;
import com.example.demo.ch3.MessageRenderer;
import com.example.demo.ch3.StandardOutMessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.demo"})
public class AppConfig {

    @Autowired
    MessageProvider messageProvider;

    @Bean("messageRenderer")
    public MessageRenderer messageRenderer(){
        MessageRenderer messageRenderer = new StandardOutMessageRenderer();
        messageRenderer.setMessageProvider(messageProvider);
        return messageRenderer;
    }
}
