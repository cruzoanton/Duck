package com.company;

public class Main {

    public static void main(String[] args) {
	Duck mallard1= new MallardDuck();
		mallard1.display();
		mallard1.performQuack();
		mallard1.performFly();
	Duck rubber=new RubberDuck();
		rubber.display();
		rubber.performFly();
		rubber.performQuack();
	}
}
