package com.designPatterns.patterns.templateMethod.version1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Specialization
 * @author Ihor Savchenko
 * @version 1.0
 */
public abstract class Ancestor extends SuperiorAncestor {

    private static final Logger logger = LoggerFactory.getLogger(Ancestor.class);

    protected void stepThree() {

        step3_1();
        step3_2();
        step3_3();
    }

    private void step3_1() {

        logger.info("Method step3_1() is implemented by Ancestor");
    }

    abstract protected void step3_2();

    private void step3_3() {

        logger.info("Method step3_3() is implemented by Ancestor");
    }
}
