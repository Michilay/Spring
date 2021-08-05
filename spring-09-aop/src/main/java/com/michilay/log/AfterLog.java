package com.michilay.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {

//    多了一个返回值
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("非注解执行后       "+"执行了"+method.getName()+"，返回结果为"+o);
    }
}
