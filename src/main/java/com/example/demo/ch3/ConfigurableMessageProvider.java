package com.example.demo.ch3;

import com.example.demo.ch1.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("provider")
public class ConfigurableMessageProvider implements MessageProvider {
    private String message;

    @Autowired
    public ConfigurableMessageProvider(String message){
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
