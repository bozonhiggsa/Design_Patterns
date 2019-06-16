package com.designPatterns.patterns.abstractFactory.implementations;

import com.designPatterns.patterns.abstractFactory.interfaces.AbstractFactory;
import com.designPatterns.patterns.abstractFactory.interfaces.Factory;
import com.designPatterns.patterns.abstractFactory.interfaces.WidgetA;
import com.designPatterns.patterns.abstractFactory.interfaces.WidgetB;

/**
 * Factory1 for creating of products
 * Factory1 encapsulates the products creating with the use of operator new
 * @author Ihor Savchenko
 * @version 1.0
 */
public class ConcreteFactory1 extends AbstractFactory {

    @Override
    public WidgetA createA() {
        return new Product1WidgetA();
    }

    @Override
    public WidgetB createB() {
        return new Product1WidgetB();
    }
}
