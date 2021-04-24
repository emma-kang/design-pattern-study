package com.designpattern.ekang.factory;

public class Factory {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore simpleStore = new PizzaStore(simplePizzaFactory);
        simpleStore.orderPizza("cheese");
        simpleStore.orderPizza("pepperoni");
    }
}
