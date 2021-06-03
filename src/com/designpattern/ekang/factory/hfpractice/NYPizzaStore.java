package com.designpattern.ekang.factory.hfpractice;

public class NYPizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            default:
                return null;
        }
    }
}
