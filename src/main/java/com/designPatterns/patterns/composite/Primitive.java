package com.designPatterns.patterns.composite;

/**
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
