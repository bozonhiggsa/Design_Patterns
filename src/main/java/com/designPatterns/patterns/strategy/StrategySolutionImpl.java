package com.designPatterns.patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Concrete implementation for StrategySolution
 * @author Ihor Savchenko
 * @version 1.0
 */
public class StrategySolutionImpl extends StrategySolution {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);
    private int state = 1;

    protected void start() {

        logger.info("Start");
    }

    protected void stop() {

        logger.info("Stop");
    }

    protected boolean nextTry() {

        logger.info("NextTry-" + state++);
        return true;
    }

    protected boolean isSolution() {

        logger.info("IsSolution-" + (state == 3));
        return (state == 3);
    }
}
