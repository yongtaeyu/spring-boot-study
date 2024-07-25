package com.example.demo.ch4;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

import java.lang.reflect.Method;

public class ProfilingInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start(invocation.getMethod().getName());

        Object returnValue = invocation.proceed();
        stopWatch.stop();

        dumpInfo(invocation, stopWatch.getTotalTimeMillis());


        return returnValue;
    }

    private void dumpInfo(MethodInvocation invocation, long totalTimeMillis) {

        Method method = invocation.getMethod();
        Object target = invocation.getThis();
        Object args = invocation.getArguments();

        System.out.println("메서드:"+method.getName());
        System.out.println("인수:"+target.getClass().getName());
        System.out.println("실행시간 :"+totalTimeMillis+"ms");

    }
}
