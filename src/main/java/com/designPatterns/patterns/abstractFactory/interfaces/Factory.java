package com.designPatterns.patterns.abstractFactory.interfaces;

/**
 * Abstract Factory
 * @author Ihor Savchenko
 * @version 1.0
 */
public interface Factory {

    WidgetA createA();

    WidgetB createB();
}
