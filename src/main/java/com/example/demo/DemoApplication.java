package com.example.demo;

import com.example.demo.ch3.MessageRenderer;
import com.example.demo.ch4.Agent;
import com.example.demo.ch4.AgentDecorator;
import com.example.demo.ch4.AppConfig;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DemoApplication {

	public static void main(String... args) {
/*
		ApplicationContext ctx = new
				AnnotationConfigApplicationContext(AppConfig.class);

		MessageRenderer renderer =
				ctx.getBean("messageRenderer", MessageRenderer.class);

		renderer.render();
*/

		Agent target = new Agent();
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.addAdvice(new AgentDecorator());
		proxyFactory.setTarget(target);
		Agent proxy = (Agent) proxyFactory.getProxy();
		target.speak();
		System.out.println("");
		proxy.speak();
	}

}