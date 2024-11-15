package com.designpattern.ekang.bdp.stragegy;

public abstract class Duck {

    public void quack() {
        System.out.println("quack");
    }

    public void swim() {
        System.out.println("swim");
    }

    public abstract void display();
}
