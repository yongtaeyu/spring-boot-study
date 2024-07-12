package com.example.demo.ch1;

public class StandardOutMessageRenderer implements MessageRenderer{

    private MessageProvider messageProvider;

    @Override
    public void render() {
        if(messageProvider == null)
            throw new RuntimeException("null");
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
