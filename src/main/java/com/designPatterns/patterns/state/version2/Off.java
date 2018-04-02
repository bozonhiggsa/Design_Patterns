package com.designPatterns.patterns.state.version2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Off - Concrete class for state machine.
 * State derived class.
 * The State derived classes only override the messages they need.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Off extends State {

    private static final Logger logger = LoggerFactory.getLogger(Off.class);
    private static Off instance = new Off();

    private Off() { }

    public static State instance() {
        return instance;
    }

    public void push(Button b) {
        b.setCurrent(On.instance());
        logger.info("   turning ON");
    }
}
