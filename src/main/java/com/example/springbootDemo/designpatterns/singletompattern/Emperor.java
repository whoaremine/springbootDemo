package com.example.springbootDemo.designpatterns.singletompattern;

public class Emperor {

    private static final Emperor emperor = new Emperor();

    private Emperor(){
    }

    public static Emperor getInstance(){
        return emperor;
    }
    public static void say(){
        System.out.println("i am the only one!!!");
    }
}
