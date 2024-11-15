package com.designpattern.ekang.bdp.stragegy;

public class SimUDuck {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();

        Duck readheadDuck = new RedheadDuck();
        readheadDuck.display();
    }
}
