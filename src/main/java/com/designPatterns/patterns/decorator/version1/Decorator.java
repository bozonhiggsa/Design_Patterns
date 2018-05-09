package com.designPatterns.patterns.decorator.version1;

/**
 * Second level base class with "is a" relationship
 * for optional functionality.
 * Decorator class "has a" instance of the "lowest common denominator".
 * Decorator class delegates to the "has a" object.
 * @author Ihor Savchenko
 * @version 1.0
 */
public abstract class Decorator implements Widget {

    private Widget widget;

    public Decorator(Widget widget) {

        this.widget = widget;
    }

    public void draw() {

        widget.draw();
    }
}
