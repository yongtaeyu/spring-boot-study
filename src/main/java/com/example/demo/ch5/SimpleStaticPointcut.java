package com.example.demo.ch5;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

public class SimpleStaticPointcut extends StaticMethodMatcherPointcut {
    @Override
    public boolean matches(Method method, Class<?> targetClass) {

        return "sing".equals(method.getName());
    }

    public ClassFilter getClassFilter(){
        return clazz -> clazz == GoodGuitarist.class;
    }
}
