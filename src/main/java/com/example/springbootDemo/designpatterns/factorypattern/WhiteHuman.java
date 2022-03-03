package com.example.springbootDemo.designpatterns.factorypattern;

public class WhiteHuman implements Human {


    @Override
    public void getColor() {
        System.out.println("White people have white skin!!");
    }

    @Override
    public void talk() {
        System.out.println("White people can speak but always say simple words");
    }
}
