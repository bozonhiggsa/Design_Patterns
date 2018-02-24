package com.designPatterns.patterns.abstractFactory.implementations;

import com.designPatterns.patterns.abstractFactory.interfaces.WidgetA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Functionality of Product2 for WidgetA
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Product2WidgetA implements WidgetA {

    private static final Logger logger = LoggerFactory.getLogger(Product2WidgetA.class);

    @Override
    public void methodA() {
        logger.debug("Successfully provided functionality Product2WidgetA");
    }

}
