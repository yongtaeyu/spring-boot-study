package com.example.demo.ch4;

import org.springframework.aop.framework.ProxyFactory;

public class ProfilingDemo {

    public static void main(String[] args) {
        WorkBean wb = getWorkBean();
        wb.doSomething(10000);
    }

    public static WorkBean getWorkBean(){


        WorkBean wb = new WorkBean();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(wb);
        proxyFactory.addAdvice(new ProfilingInterceptor());

        return (WorkBean) proxyFactory.getProxy();
    }
}
