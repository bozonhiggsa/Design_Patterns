package com.designPatterns.patterns.composite;

/**
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
