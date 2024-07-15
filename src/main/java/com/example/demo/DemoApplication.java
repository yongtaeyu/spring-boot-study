package com.example.demo;

import com.example.demo.ch3.Container;
import com.example.demo.ch3.ContextualizedDependencyLookup;
import com.example.demo.ch3.DefaultContainer;
import com.example.demo.ch3.ManagedComponent;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DemoApplication {
	public static void main(String[] args) {
		ManagedComponent managedComponent = new ContextualizedDependencyLookup();
		managedComponent.performLookup(new DefaultContainer());
		System.out.println(managedComponent);
	}
}
