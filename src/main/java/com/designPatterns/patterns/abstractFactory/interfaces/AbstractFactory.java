package com.designPatterns.patterns.abstractFactory.interfaces;

import com.designPatterns.patterns.abstractFactory.TypeOfProduct;
import com.designPatterns.patterns.abstractFactory.implementations.ConcreteFactory1;
import com.designPatterns.patterns.abstractFactory.implementations.ConcreteFactory2;

/**
 * Abstract Factory that employs a factory method
 * @author Ihor Savchenko
 * @version 1.0
 */
public abstract class AbstractFactory implements Factory{

    private static final ConcreteFactory1 CONCRETE_FACTORY_1 = new ConcreteFactory1();
    private static final ConcreteFactory2 CONCRETE_FACTORY_2 = new ConcreteFactory2();

    public static AbstractFactory getFactory(TypeOfProduct typeOfProduct) {
        AbstractFactory factory = null;
        switch (typeOfProduct) {
            case PRODUCT1:
                factory = CONCRETE_FACTORY_1;
                break;
            case PRODUCT2:
                factory = CONCRETE_FACTORY_2;
                break;
        }
        return factory;
    }
}
