package com.designPatterns.patterns.command;

/**
 * Some logic encapsulates into this class
 * @author Ihor Savchenko
 * @version 1.0
 */
public class SimpleCommand {

    private int state;

    public SimpleCommand(int state) {
        this.state = state;
    }

    public void add(Integer value) {
        state += value.intValue();
    }

    public void addTwoOperands(Integer firstValue, Integer secondValue) {
        state = state + firstValue.intValue() + secondValue.intValue();
    }

    public int getState() {
        return state;
    }
}
