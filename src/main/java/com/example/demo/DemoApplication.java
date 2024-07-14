package com.example.demo;

import com.example.demo.ch1.*;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class DemoApplication {
	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("classpath:spring/application-context.xml");
		context.refresh();
		MessageProvider messageProvider = context.getBean("provider", MessageProvider.class);
		System.out.println(messageProvider.getMessage());
	}
}
