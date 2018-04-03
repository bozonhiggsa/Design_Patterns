package com.designPatterns.patterns.visitor.version1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * "visitor" derived class for each "operation"
 * to do on "elements".
 * @author Ihor Savchenko
 * @version 1.0
 */
public class UpVisitor implements Visitor {

    private static final Logger logger = LoggerFactory.getLogger(UpVisitor.class);

    public void visit(FirstElement firstElement) {

        logger.info("do Up on " + firstElement.getFirstElement());
    }

    public void visit(SecondElement secondElement) {

        logger.info("do Up on " + secondElement.getSecondElement());
    }

    public void visit(ThirdElement thirdElement) {

        logger.info("do Up on " + thirdElement.getThirdElement());
    }
}

