package com.example.demo.ch1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("renderer")
public class StandardOutMessageRenderer implements MessageRenderer{

    private MessageProvider messageProvider;
    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "messageProvider 클래스의 프로퍼티를 설정해야 합니다:"
                            + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }
    @Override
    @Autowired
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }
    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
