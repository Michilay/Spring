package com.michilay.diy;


//使用注解实现AOP

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.aop.support.AopUtils;
import org.springframework.stereotype.Component;


@Aspect//直接标注这个类是个切面
public class AnnotationPointCut {

    @Before("execution(* com.michilay.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("注解前");
    }
    @After("execution(* com.michilay.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("注解后");
    }
//    在环绕增强中，我们可以给定一个参数，代表我们要处理切入的点
    @Around("execution(* com.michilay.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPointp) throws Throwable {
        System.out.println("注解环绕前");
        //执行方法
        Object proceed = joinPointp.proceed();
        System.out.println("注解环绕后");
    }
}
