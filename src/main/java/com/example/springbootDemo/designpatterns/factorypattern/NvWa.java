package com.example.springbootDemo.designpatterns.factorypattern;

public class NvWa {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        AbstractHumanFactory YinYanglu = new HumanFactory();
        Human whiteMan = YinYanglu.createHuman(WhiteHuman.class);
        whiteMan.getColor();
        whiteMan.talk();
    }
}
