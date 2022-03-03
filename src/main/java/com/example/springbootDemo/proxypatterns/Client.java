package com.example.springbootDemo.proxypatterns;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("zhang san");
        InvocationHandler handler = new GamePlayIH(player);
        System.out.println("Start : 2022-02-14");
        ClassLoader cl =  player.getClass().getClassLoader();
//        IGamePlayer proxy = Proxy.
    }
}
