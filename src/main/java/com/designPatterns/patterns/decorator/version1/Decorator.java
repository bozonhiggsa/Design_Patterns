package com.designPatterns.patterns.decorator.version1;

/**
 * A second level base class (Decorator) to support
 * the optional wrapper classes.
 * Attach additional responsibilities to an object dynamically.
 * Decorators provide a flexible alternative to subclassing
 * for extending functionality.
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
