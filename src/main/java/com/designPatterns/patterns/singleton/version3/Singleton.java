package com.designPatterns.patterns.singleton.version3;

/**
 * Singleton based on a static factory method,
 * with eager just in time initialization
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
