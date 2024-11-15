package com.designpattern.ekang.cdp.factory;

// Franchising the pizza store
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // Moved the factory object to this method
    // act as factory
    protected abstract Pizza createPizza(String type);
}
