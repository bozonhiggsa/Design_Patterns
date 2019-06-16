package com.designPatterns.patterns.singleton.version1;

/**
 * Singleton based on a private static nested class, with eager just in time initialization
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Singleton {

    private Singleton() {}

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}

