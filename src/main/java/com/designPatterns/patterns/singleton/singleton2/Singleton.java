package com.designPatterns.patterns.singleton.singleton2;

/**
 * Singleton based on a public static method getInstance() with synchronized,
 * with lazy initialization on first use
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Singleton {

    private static Singleton INSTANCE;

    private Singleton() {}

    public static Singleton getInstance() {

        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
