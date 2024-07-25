package com.example.demo.ch5;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class SimpleAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        System.out.println("SimpleAdvice");
        System.out.println(invocation.getMethod().getName());
        System.out.println("end");


        return invocation.proceed();
    }
}
