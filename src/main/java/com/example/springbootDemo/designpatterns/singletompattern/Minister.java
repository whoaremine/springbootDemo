package com.example.springbootDemo.designpatterns.singletompattern;

public class Minister {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i ++){
           Emperor emperor = Emperor.getInstance();
           emperor.say();
        }
    }
}
