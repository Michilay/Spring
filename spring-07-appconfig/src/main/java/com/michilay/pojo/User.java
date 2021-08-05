package com.michilay.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//说明这个类被spring接管了，注册到了IOC中
//@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }
    @Value("michilay")
    public void setName(String name) {
        this.name = name;
    }
}
