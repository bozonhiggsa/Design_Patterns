package com.designPatterns.patterns.state.version1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Base abstract class for chain elements.
 * @author Ihor Savchenko
 * @version 1.0
 */
public abstract class State {

    private static final Logger logger = LoggerFactory.getLogger(State.class);

    public void pull(Chain wrapper) {
        wrapper.setState(new Off());
        logger.info("   turning off");
    }
}