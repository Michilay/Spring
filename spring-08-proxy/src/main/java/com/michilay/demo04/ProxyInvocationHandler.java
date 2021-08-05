package com.michilay.demo04;


import com.michilay.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    //处理代理实例，并返回结构
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        fun(method.getName());
        //动态代理的本质，就是使用反射的机制来实现
        Object result = method.invoke(target, args);
        return result;
    }

    public void fun(String str){
        System.out.println(str+"方法");
    }
}
