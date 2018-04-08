package com.designPatterns.patterns.composite;

/**
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
