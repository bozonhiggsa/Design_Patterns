package com.designPatterns.patterns.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Observer Three
 * @author Ihor Savchenko
 * @version 1.0
 */
public class ObserverThree implements ObserverReaction {

    private static final Logger logger = LoggerFactory.getLogger(ObserverThree.class);
    private final String name = "ObserverThree";

    @Override
    public void react(AtomicInteger currentState) {
        logger.info(name + " reacted on the event " + currentState);
    }
}
