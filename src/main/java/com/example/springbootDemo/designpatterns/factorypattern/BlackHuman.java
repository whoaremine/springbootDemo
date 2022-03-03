package com.example.springbootDemo.designpatterns.factorypattern;

public class BlackHuman implements Human {


    @Override
    public void getColor() {
        System.out.println("Black people have black skin!!");
    }

    @Override
    public void talk() {
        System.out.println("Black people can speak but no one can understand");
    }
}
