package com.designPatterns.patterns.observer.observer1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Observer One
 * @author Ihor Savchenko
 * @version 1.0
 */
public class ObserverOne implements ObserverReaction {

    private static final Logger logger = LoggerFactory.getLogger(ObserverOne.class);
    private final String name = "ObserverOne";

    @Override
    public void react(AtomicInteger currentState) {
        logger.info(name + " reacted on the event " + currentState);
    }
}
