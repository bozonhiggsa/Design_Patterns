package com.designPatterns.patterns.singleton.singleton2;

/**
 * Singleton based on a public static method getInstance with synchronized
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {

        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
