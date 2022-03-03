package com.example.springbootDemo.designpatterns.factorypattern;

public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Human human = null;
        human = (T) Class.forName(c.getName()).newInstance();
        return (T) human;
    }
}
