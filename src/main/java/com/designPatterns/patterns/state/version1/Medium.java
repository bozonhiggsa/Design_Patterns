package com.designPatterns.patterns.state.version1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Medium - Element of the chain.
 * State derived class.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Medium extends State {

    private static final Logger logger = LoggerFactory.getLogger(Medium.class);

    public void pull(Chain wrapper) {
        wrapper.setState(new High());
        logger.info("   high speed");
    }
}
