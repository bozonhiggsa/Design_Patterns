package com.designPatterns.patterns.decorator.version1;

/**
 * The client has the responsibility to compose
 * desired configurations.
 * The client configures the type and ordering of
 * Core and Decorator objects.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        Widget widget = new BorderDecorator(new BorderDecorator(new ScrollDecorator(new TextField(80, 24))));
        widget.draw();
    }
}
