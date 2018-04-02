package com.designPatterns.patterns.state.version1;

/**
 * Class that defines the chain structure.
 * This class is the "wrapper" class.
 * The wrapper class maintains a "current" State object.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Chain {

    private State current;

    public Chain() {
        current = new Off();
    }

    public void setState(State state) {
        current = state;
    }

    public void pull() {
        current.pull(this);
    }
}
