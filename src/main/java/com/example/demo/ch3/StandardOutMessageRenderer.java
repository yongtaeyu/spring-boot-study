package com.example.demo.ch3;

// renderer 구현체
public class StandardOutMessageRenderer implements MessageRenderer{

    private MessageProvider messageProvider;

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    StandardOutMessageRenderer.class.getName()
                            + " 클래스의 messageProvider 프로퍼티를 설정해야 합니다.");
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        System.out.println(" --> StandardOutMessageRenderer: messageProvider 설정");
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
