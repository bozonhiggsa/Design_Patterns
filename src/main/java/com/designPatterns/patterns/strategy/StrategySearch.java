package com.designPatterns.patterns.strategy;

/**
 * Abstract class StrategySearch
 * Bury algorithm implementation details in derived classes.
 * Derived classes could be implemented using the Template Method pattern.
 * @author Ihor Savchenko
 * @version 1.0
 */
public abstract class StrategySearch implements Strategy {

    public void solve() {

        while (true) {
            preProcess();
            if (search()) {
                break;
            }
            postProcess();
        }
    }

    abstract void preProcess();
    abstract boolean search();
    abstract void postProcess();
}
