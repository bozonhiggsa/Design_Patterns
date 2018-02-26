package com.designPatterns.patterns.abstractFactory.implementations;

import com.designPatterns.patterns.abstractFactory.interfaces.WidgetA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Functionality of Product1 for WidgetA
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Product1WidgetA implements WidgetA {

    private static final Logger logger = LoggerFactory.getLogger(Product1WidgetA.class);

    @Override
    public void methodA() {
        logger.debug("Functionality Product1WidgetA is successfully provided");
    }

}
