package com.designpattern.ekang.singleton;

public class multipleThreadSingleton {
    // volatile keyword ensures that multiple threads handle the uniqueInstance variable correctly
    // when it is being initialized to the Singleton instance
    private volatile static multipleThreadSingleton uniqueInstance;
    private multipleThreadSingleton() {};
    public static multipleThreadSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new multipleThreadSingleton();
                }
            }
        }

        return uniqueInstance;
    }
}
