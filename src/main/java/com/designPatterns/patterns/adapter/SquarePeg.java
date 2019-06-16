package com.designPatterns.patterns.adapter;

/**
 * The OLD component.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class SquarePeg {

    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
