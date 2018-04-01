package com.designPatterns.patterns.templateMethod.version1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Generalization
 * @author Ihor Savchenko
 * @version 1.0
 */
public abstract class SuperiorAncestor {

    private static final Logger logger = LoggerFactory.getLogger(SuperiorAncestor.class);

    void findSolution() {

        stepOne();
        stepTwo();
        stepThree();
        stepFour();
    }

    private void stepOne() {

        logger.info("Method stepOne() is implemented by SuperiorAncestor");
    }

    abstract void stepTwo();
    abstract void stepThree();

    void stepFour() {

        logger.info("Method stepFour() is implemented by SuperiorAncestor");
    }
}
