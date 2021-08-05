package com.michilay.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//组件
@Component
public class User {

    public String name = "Michilay";
    @Value("123")
    public void setName(String name) {
        this.name = name;
    }
}
