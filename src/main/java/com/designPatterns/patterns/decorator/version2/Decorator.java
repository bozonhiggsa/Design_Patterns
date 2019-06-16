package com.designPatterns.patterns.decorator.version2;

/**
 * The Decorator class inherits from the LCD interface.
 * The Decorator class declares a composition relationship
 * to the LCD interface, and this data member
 * is initialized in its constructor.
 * The Decorator class delegates to the LCD object.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Decorator implements LCD {

    private LCD inner;

    public Decorator(LCD i) {

        inner = i;
    }

    public void write(String[] s) {
        inner.write(s);
    }

    public void read(String[] s) {
        inner.read(s);
    }
}
