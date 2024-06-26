package com.designpatterns.demo.designpatterns.singleton;

/**
 * When the singleton class is loaded, SingletonHelper class is not loaded into memory and only when someone calls the getInstance() method, this class gets loaded and creates the singleton class instance.
 * This is the most widely used approach for the singleton class as it doesn’t require synchronization.
 * */
public class BillPughSingleton {
    private BillPughSingleton(){}

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
