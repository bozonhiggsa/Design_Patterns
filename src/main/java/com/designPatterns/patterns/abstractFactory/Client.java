package com.designPatterns.patterns.abstractFactory;

import com.designPatterns.patterns.abstractFactory.implementations.ConcreteFactory1;
import com.designPatterns.patterns.abstractFactory.implementations.ConcreteFactory2;
import com.designPatterns.patterns.abstractFactory.interfaces.Factory;

/**
 * Client that uses concrete products
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Client {

    private Factory factory;

    public Factory getFactory() {
        return factory;
    }

    public void setFactory1() {
        this.factory = new ConcreteFactory1();
    }

    public void setFactory2() {
        this.factory = new ConcreteFactory2();
    }
}
