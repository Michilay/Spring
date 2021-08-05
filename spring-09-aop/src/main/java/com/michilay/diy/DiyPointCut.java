package com.michilay.diy;

public class DiyPointCut {

    public void before(){
        System.out.println("非注解自定义前");
    }
    public void after(){
        System.out.println("非注解自定义后");
    }
}
