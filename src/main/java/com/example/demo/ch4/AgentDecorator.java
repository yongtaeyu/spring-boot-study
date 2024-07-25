package com.example.demo.ch4;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AgentDecorator implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.print("james ");
        Object value = invocation.proceed();
        System.out.println("!");
        return value;
    }
}
