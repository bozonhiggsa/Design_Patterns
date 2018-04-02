package com.designPatterns.patterns.state.version1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * State base class replicates the methods of the state
 * machine interface. Each method takes one additional parameter:
 * an instance of the wrapper class.
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