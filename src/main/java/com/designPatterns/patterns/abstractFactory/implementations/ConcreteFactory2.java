package com.designPatterns.patterns.abstractFactory.implementations;

import com.designPatterns.patterns.abstractFactory.interfaces.Factory;
import com.designPatterns.patterns.abstractFactory.interfaces.WidgetA;
import com.designPatterns.patterns.abstractFactory.interfaces.WidgetB;

/**
 * Factory2 for creating of products
 * @author Ihor Savchenko
 * @version 1.0
 */
public class ConcreteFactory2 implements Factory {

    @Override
    public WidgetA createA() {

        return new Product2WidgetA();
    }

    @Override
    public WidgetB createB() {

        return new Product2WidgetB();
    }
}
