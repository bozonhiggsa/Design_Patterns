package com.designPatterns.patterns.visitor.version2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * "visitor" derived class for each "operation"
 * to do on "elements".
 * @author Ihor Savchenko
 * @version 1.0
 */
public class FirstBaseImpl implements Base {

    private static final Logger logger = LoggerFactory.getLogger(FirstBaseImpl.class);

    public void execute(Base base) {

        base.doJob(this);
    }

    public void doJob(FirstBaseImpl firstBase) {

        logger.info("FirstBaseImpl object calls by yourself");
    }

    public void doJob(SecondBaseImpl secondBase) {

        logger.info("SecondBaseImpl object was called from FirstBaseImpl");
    }

    public void doJob(ThirdBaseImpl thirdBase) {

        logger.info("ThirdBaseImpl object was called from FirstBaseImpl");
    }
}
