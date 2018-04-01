package com.designPatterns.patterns.state.version1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Off - Element of the chain.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Off extends State {

    private static final Logger logger = LoggerFactory.getLogger(Off.class);

    public void pull(Chain wrapper) {
        wrapper.setState(new Low());
        logger.info("   low speed");
    }
}