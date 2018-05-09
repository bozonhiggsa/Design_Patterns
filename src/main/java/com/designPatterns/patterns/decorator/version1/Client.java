package com.designPatterns.patterns.decorator.version1;

/**
 *  Client has the responsibility to compose
 *  desired configurations.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        Widget widget = new BorderDecorator(new BorderDecorator(new ScrollDecorator(new TextField(80, 24))));
        widget.draw();
    }
}
