package com.company;

public class RubberDuck extends Duck{
    public RubberDuck(){
        quakBeh=new Squeak();
        flyBeh=new FlyNoWay();
    }
    public void display(){
        System.out.println("I am a real Rubber Duck!");
    }
}
