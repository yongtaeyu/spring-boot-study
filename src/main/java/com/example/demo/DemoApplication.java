package com.example.demo;

import com.example.demo.ch1.*;
import com.example.demo.ch2.HelloWorldConfiguration;
import com.example.demo.ch3.Oracle;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class DemoApplication {
	public static void main(String[] args) {

//		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
//		reader.loadBeanDefinitions(new ClassPathResource("spring/application-context.xml"));
//		Oracle oracle= (Oracle) beanFactory.getBean("oracle");
//		System.out.println(oracle.defineMeaningOfLife());


//		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
//		context.load("classpath:spring/application-context.xml");
//		context.refresh();
//		MessageRenderer messageRenderer = context.getBean("renderer", MessageRenderer.class);
//		messageRenderer.render();
//		context.close();

		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		MessageRenderer messageRenderer = ctx.getBean("renderer", MessageRenderer.class);
		messageRenderer.render();


	}
}
