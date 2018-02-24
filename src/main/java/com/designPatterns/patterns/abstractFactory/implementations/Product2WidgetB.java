package com.designPatterns.patterns.abstractFactory.implementations;

import com.designPatterns.patterns.abstractFactory.interfaces.WidgetB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Functionality of Product2 for WidgetB
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Product2WidgetB implements WidgetB {

    private static final Logger logger = LoggerFactory.getLogger(Product2WidgetB.class);

    @Override
    public void methodB() {
        logger.debug("Successfully provided functionality Product2WidgetB");
    }

}