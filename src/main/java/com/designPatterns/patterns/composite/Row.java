package com.designPatterns.patterns.composite;

/**
 * Another child of Composite.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Row extends Composite {

    public Row(int val) {
        super(val);
    }

    public void traverse() {
        System.out.print("Row");
        super.traverse();
    }
}
