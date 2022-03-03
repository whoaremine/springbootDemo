package com.example.springbootDemo.proxypatterns;

public class GamePlayer implements IGamePlayer {
    private String name = "";
    public GamePlayer(String name){
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("The login name is "+ user + this.name+"login successfully!!");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "fighting with monsters");
    }

    @Override
    public void update() {
        System.out.println(this.name + "upgrade one level again!");
    }
}
