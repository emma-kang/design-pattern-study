package com.designpattern.ekang.factory;

public class Factory {
    public static void main(String[] args) {
        Pizza pizza = orderPizza("cheese");
    }

    static Pizza orderPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese"))
            pizza = new CheesePizza();
        else if (type.equals("greek"))
            pizza = new GreekPizza();
        else if (type.equals("pepperoni"))
            pizza = new PepperoniPizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
