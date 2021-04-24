package com.designpattern.ekang.factory;

public class PizzaStore {
    // give reference to SimplePizzaFactory
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        // No concrete instantiation
        // Replaced createPizza method on the factory object
        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
