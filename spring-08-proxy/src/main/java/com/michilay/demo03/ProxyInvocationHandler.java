package com.michilay.demo03;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成得到代理类
    public Object getProxy(){
//        什么类代理什么接口在什么地方调用
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，就是使用反射的机制来实现
        fun();
        Object result = method.invoke(rent, args);
        return result;
    }

    public void fun(){
        System.out.println("其他操作");
    }
}
