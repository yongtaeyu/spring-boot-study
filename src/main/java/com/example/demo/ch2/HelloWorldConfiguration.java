package com.example.demo.ch2;

import com.example.demo.ch1.HelloWorldMessageProvider;
import com.example.demo.ch1.MessageProvider;
import com.example.demo.ch1.MessageRenderer;
import com.example.demo.ch1.StandardOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MessageProvider provider(){
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRenderer renderer(){
        MessageRenderer mr = new StandardOutMessageRenderer();
        mr.setMessageProvider(provider());
        return mr;
    }
}
