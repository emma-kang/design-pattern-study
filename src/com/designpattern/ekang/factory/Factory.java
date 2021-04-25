package com.designpattern.ekang.factory;

public class Factory {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Emma ordered a " + pizza.getName());

        Pizza pizza2 = nyStore.orderPizza("pepperoni");
        System.out.println("Jane ordered a " + pizza2.getName());
    }
}
