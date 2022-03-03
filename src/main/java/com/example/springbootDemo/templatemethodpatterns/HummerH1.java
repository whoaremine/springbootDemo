package com.example.springbootDemo.templatemethodpatterns;

public class HummerH1 extends HummerModel {

    @Override
    public void start() {
        System.out.println("start.......");
    }

    @Override
    public void stop() {
        System.out.println("stop.......");
    }

    @Override
    public void alarm() {
        System.out.println("alarm.......");
    }

    @Override
    public void engineBoom() {
        System.out.println("Hummer start boom.......");
    }

}
