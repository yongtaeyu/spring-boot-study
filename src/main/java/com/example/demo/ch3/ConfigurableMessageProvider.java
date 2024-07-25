package com.example.demo.ch3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ConfigurableMessageProvider implements MessageProvider{

    private String message;

    public ConfigurableMessageProvider(@Value("love on the world")String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return this.message;
    }
}
