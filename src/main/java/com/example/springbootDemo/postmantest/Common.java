package com.example.springbootDemo.postmantest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Common {
    public String name2;

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }
}
