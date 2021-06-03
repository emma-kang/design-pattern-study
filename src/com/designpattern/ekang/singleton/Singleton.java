package com.designpattern.ekang.singleton;

// ensure a class has only one instance, and provides a global point of access to it
public class Singleton {
    private static Singleton uniqueInstance;
    // make default constructor private, to prevent new operator
    private Singleton() {};

    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new Singleton();
        return uniqueInstance;
    }
}
