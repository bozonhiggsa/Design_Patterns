package com.designPatterns.patterns.templateMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Realization
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Successor extends Ancestor {

    private static final Logger logger = LoggerFactory.getLogger(Successor.class);

    protected void stepTwo() {

        logger.info("Method stepTwo() is implemented by Successor");
    }

    protected void step3_2() {

        logger.info("Method step3_2() is implemented by Successor");
    }

    protected void stepFour() {

        logger.info("Method stepFour() is implemented by Successor");
        super.stepFour();
    }
}
