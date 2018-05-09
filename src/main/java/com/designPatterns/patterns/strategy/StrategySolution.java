package com.designPatterns.patterns.strategy;

/**
 * Abstract class StrategySolution
 * Bury algorithm implementation details in derived classes.
 * Derived classes could be implemented using the Template Method pattern.
 * @author Ihor Savchenko
 * @version 1.0
 */
public abstract class StrategySolution implements Strategy {

    public void solve() {

        start();
        while (nextTry() && !isSolution()) {}
        stop();
    }

    abstract void start();
    abstract boolean nextTry();
    abstract boolean isSolution();
    abstract void stop();
}
