package com.company;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quakBeh=new Quack();
        flyBeh=new FlyWithWings();
    }
    public void display(){
        System.out.println("I am a real Mallard Duck!");
    }
}
