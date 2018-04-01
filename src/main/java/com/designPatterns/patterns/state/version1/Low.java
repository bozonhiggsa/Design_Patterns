package com.designPatterns.patterns.state.version1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Low - Element of the chain.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Low extends State {

    private static final Logger logger = LoggerFactory.getLogger(Low.class);

    public void pull(Chain wrapper) {
        wrapper.setState(new Medium());
        logger.info("   medium speed");
    }
}