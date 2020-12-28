package com.company;

public class MuteQuack implements QuackBeh{
    @Override
    public void quack() {
        System.out.println("<silence>");
    }
}
