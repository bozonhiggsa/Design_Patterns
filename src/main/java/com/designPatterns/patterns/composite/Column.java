package com.designPatterns.patterns.composite;

/**
 * Another child of Composite.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Column extends Composite {

    public Column(int val) {

        super(val);
    }

    public void traverse() {

        System.out.print("Col");
        super.traverse();
    }
}
