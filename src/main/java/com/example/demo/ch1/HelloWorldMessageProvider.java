package com.example.demo.ch1;

public class HelloWorldMessageProvider implements MessageProvider{

    @Override
    public String getMessage() {
        return "HELLO WORLD";
    }
}
