package com.designPatterns.patterns.visitor.visitor1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * "visitor" derived class for each "operation"
 * to do on "elements".
 * @author Ihor Savchenko
 * @version 1.0
 */
public class DownVisitor implements Visitor {

    private static final Logger logger = LoggerFactory.getLogger(DownVisitor.class);

    public void visit(FirstElement firstElement) {

        logger.info("do Down on " + firstElement.getFirstElement());
    }

    public void visit(SecondElement secondElement) {

        logger.info("do Down on " + secondElement.getSecondElement());

    }

    public void visit(ThirdElement thirdElement) {

        logger.info("do Down on " + thirdElement.getThirdElement());
    }
}
