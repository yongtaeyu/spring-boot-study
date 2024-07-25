package com.example.demo.ch4;

import com.example.demo.ch3.MessageProvider;

public class ConfigurableMessageProvider implements MessageProvider {

    private String message = "default message";

    public ConfigurableMessageProvider(){
    }

    public ConfigurableMessageProvider(String message){
        this.message = message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}
