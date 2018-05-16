package com.designPatterns.patterns.composite;

/**
 * Each Composite object "couples" itself only to the
 * interface Component as it manages its "children".
 * Composite contains components, each of which could be a composite.
 * @author Ihor Savchenko
 * @version 1.0
 */
public abstract class Composite implements Component {

    private Component[] children = new Component[9];
    private int total = 0;
    private int value;

    public Composite(int val) {

        value = val;
    }

    public void add(Component c) {

        children[total++] = c;
    }

    public void traverse() {

        System.out.print(value + "  ");
        for (int i=0; i < total; i++) {
            children[i].traverse();
        }
    }
}
