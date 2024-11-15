package com.designpattern.ekang.cdp.singleton;

// ensure a class has only one instance, and provides a global point of access to it
public class Singleton {
    // static variable to hold one instance of the class Singleton
    private static Singleton uniqueInstance;
    // constructor is declared private; only signleton can instantiate this class.
    private Singleton() {};

    public static synchronized Singleton getInstance() {
        // uniqueInstance holds ONE instance and therefore if it is null, there is no created instance yet
        if (uniqueInstance == null)
            // create instance via private constructor and assign it to uniqueInstance
            // Note that if we never need the instance, it never gets created. == lazy instantiation
            uniqueInstance = new Singleton();
        return uniqueInstance;
    }
}
