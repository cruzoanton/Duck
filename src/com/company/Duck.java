package com.company;

public abstract class Duck {
    FlyBeh flyBeh;
    QuackBeh quakBeh;

    public Duck() {
    }
        public abstract void display ();
        public void performFly () {
            flyBeh.fly();
        }
        public void performQuack() {
            quakBeh.quack();
        }
        public void swim() {
            System.out.println("All duck swim!");
        }
    }

