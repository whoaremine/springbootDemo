package com.example.springbootDemo.designpatterns.factorypattern;

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c) throws ClassNotFoundException, IllegalAccessException, InstantiationException;
}
