package com.designPatterns.patterns.visitor.version2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * "Visitor" derived class for each "operation"
 * to do on "elements".
 * @author Ihor Savchenko
 * @version 1.0
 */
public class ThirdBaseImpl implements Base {

    private static final Logger logger = LoggerFactory.getLogger(ThirdBaseImpl.class);

    public void execute(Base base) {

        base.doJob(this);
    }

    public void doJob(FirstBaseImpl firstBase) {

        logger.info("FirstBaseImpl object was called from ThirdBaseImpl");
    }

    public void doJob(SecondBaseImpl secondBase) {

        logger.info("SecondBaseImpl object was called from ThirdBaseImpl");
    }

    public void doJob(ThirdBaseImpl thirdBase) {

        logger.info("ThirdBaseImpl object calls by yourself");
    }
}
