package com.designPatterns.patterns.state.version2;

/**
 * On - Concrete class for state machine.
 * State derived class.
 * The State derived classes only override the messages they need.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class On extends State {

    private static On instance = new On();

    private On() {}

    public static State instance() {
        return instance;
    }
}
