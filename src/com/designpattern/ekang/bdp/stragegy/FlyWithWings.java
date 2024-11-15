package com.designpattern.ekang.bdp.stragegy;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Let's fly");
    }
}
