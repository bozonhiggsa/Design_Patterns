package com.designPatterns.patterns.abstractFactory.implementations;

import com.designPatterns.patterns.abstractFactory.interfaces.WidgetB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Functionality of Product1 for WidgetB
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Product1WidgetB implements WidgetB {

    private static final Logger logger = LoggerFactory.getLogger(Product1WidgetB.class);

    @Override
    public void methodB() {
        logger.debug("Functionality Product1WidgetB is successfully provided");
    }

}
