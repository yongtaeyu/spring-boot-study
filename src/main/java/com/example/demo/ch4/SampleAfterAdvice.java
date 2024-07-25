package com.example.demo.ch4;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

public class SampleAfterAdvice implements AfterReturningAdvice {

    public static void main(String... args) {

        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new SampleAfterAdvice());
        pf.setTarget(new Agent());

        Agent  agent = (Agent) pf.getProxy();
        agent.speak();

    }

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("After method: " + method.getName());
    }
}
