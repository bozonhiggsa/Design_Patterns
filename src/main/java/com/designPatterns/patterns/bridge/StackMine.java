package com.designPatterns.patterns.bridge;

/**
 * Derive the separate implementations from the common abstraction.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class StackMine implements StackImp {

    private Object[] items = new Object[20];
    private int total = -1;

    public Object push(Object o) {

        return items[++total] = o;
    }

    public Object peek() {

        return items[total];
    }

    public Object pop() {

        return items[total--];
    }

    public boolean empty() {

        return total == -1;
    }
}

