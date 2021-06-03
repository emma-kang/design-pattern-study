package com.designpattern.ekang.factory.hfpractice;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println(dough + " dough");
        System.out.println(sauce + " sauce");
        System.out.println("Adding toppings:");

        for (Object topping : toppings) {
            System.out.println(topping);
        }
    }

    public void bake() {
        System.out.println("Baking " + name);
    }

    public void cut() {
        System.out.println("Cutting " + name);
    }

    public void box() {
        System.out.println("Boxing " + name);
    }

    public String getName() {
        return name;
    }
}
