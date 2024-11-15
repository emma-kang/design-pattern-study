package com.designpattern.ekang.bdp.stragegy;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("Redhead Duck");
    }
}
