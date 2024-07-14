package com.example.demo.ch1;


import org.springframework.stereotype.Component;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider{

    @Override
    public String getMessage() {
        return "HELLO WORLD";
    }
}
