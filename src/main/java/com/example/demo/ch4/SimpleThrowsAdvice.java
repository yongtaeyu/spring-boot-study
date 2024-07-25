package com.example.demo.ch4;

import org.springframework.aop.ThrowsAdvice;
import org.springframework.aop.framework.ProxyFactory;

public class SimpleThrowsAdvice implements ThrowsAdvice{

    public static void main(String... args) {

        ErrorBean errorBean = new ErrorBean();

        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(errorBean);
        pf.addAdvice(new SimpleThrowsAdvice());

        ErrorBean proxy = (ErrorBean) pf.getProxy();

        try{
            proxy.errorProneMethod();
        }catch (Exception e){
        }



    }

    public void afterThrowing(Exception ex) throws Throwable {
        System.out.println("ex.getName :: "+ex.getClass().getName());
    }
}
