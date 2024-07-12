package com.example.demo;

import com.example.demo.ch1.*;
import com.example.demo.ch2.HelloWorldConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// 1장 애플리케이션 만들기
		//MessageRenderer messageRenderer = new StandardOutMessageRenderer();
		//messageRenderer.setMessageProvider(new HelloWorldMessageProvider());
		//messageRenderer.render();

		// 2. factory class 만들어 사용하기.
		// 구현 클래스 이름을 읽어서 파일 인스턴스를 가지고 와서 만드는 간단한
		// factory class 구현
		/*
		MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
		MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();
		SpringApplication.run(DemoApplication.class, args);
		*/
		// main
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		MessageRenderer mr= ctx.getBean("renderer", MessageRenderer.class);
		mr.render();

	}

}
