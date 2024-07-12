package com.example.demo.ch1;

import java.util.Properties;

// factory create
public class MessageSupportFactory {

    private static MessageSupportFactory instance;
    private Properties properties;
    private MessageRenderer messageRenderer;
    private MessageProvider messageProvider;

    private MessageSupportFactory(){
        properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("/msf.properties"));

            messageRenderer = (MessageRenderer) Class.forName(properties.getProperty("renderer"))
                    .getDeclaredConstructor()
                    .newInstance();
            messageProvider = (MessageProvider) Class.forName(properties.getProperty("provider"))
                    .getDeclaredConstructor()
                    .newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance(){
        return instance;
    }

    public MessageRenderer getMessageRenderer(){
        return this.messageRenderer;
    }
    public MessageProvider getMessageProvider(){
        return this.messageProvider;
    }
}
