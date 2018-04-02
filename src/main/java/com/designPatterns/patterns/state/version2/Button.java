package com.designPatterns.patterns.state.version2;

/**
 * Wrapper class that models the state machine.
 * This class is the "wrapper" class.
 * The wrapper class maintains a "current" State object.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Button {

    private State current;

    public Button() {
        current = Off.instance();
    }

    public void setCurrent(State s) {
        current = s;
    }

    public void push() {
        current.push(this);
    }
}
