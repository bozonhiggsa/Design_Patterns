package com.designPatterns.patterns.state.version2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Base class for states machine that makes
 * the concrete states interchangeable and specifies
 * any useful "default" behavior
 * @author Ihor Savchenko
 * @version 1.0
 */
public class State {

    private static final Logger logger = LoggerFactory.getLogger(State.class);

    public void push(Button b) {
        b.setCurrent(Off.instance());
        logger.info("   turning OFF");
    }
}
