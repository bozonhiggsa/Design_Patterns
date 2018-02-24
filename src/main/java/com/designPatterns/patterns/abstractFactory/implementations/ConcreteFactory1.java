package com.designPatterns.patterns.abstractFactory.implementations;

import com.designPatterns.patterns.abstractFactory.interfaces.Factory;
import com.designPatterns.patterns.abstractFactory.interfaces.WidgetA;
import com.designPatterns.patterns.abstractFactory.interfaces.WidgetB;

/**
 * Factory1 for creating of products
 * @author Ihor Savchenko
 * @version 1.0
 */
public class ConcreteFactory1 implements Factory {

    @Override
    public WidgetA createA() {

        return new Product1WidgetA();
    }

    @Override
    public WidgetB createB() {

        return new Product1WidgetB();
    }
}
