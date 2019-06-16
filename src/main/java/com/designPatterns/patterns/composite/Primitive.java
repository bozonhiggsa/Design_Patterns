package com.designPatterns.patterns.composite;

/**
 * Primitive is a simply implementation of the Component.
 * Primitive don't contain components.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Primitive implements Component {

    private int value;

    public Primitive(int val) {

        value = val;
    }

    public void traverse() {
        System.out.print( value + "  " );
    }
}
