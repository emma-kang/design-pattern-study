package com.designpattern.ekang.bdp.stragegy;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new FlyNoWay(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }
}
