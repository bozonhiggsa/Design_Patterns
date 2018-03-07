package com.designPatterns.patterns.observer.observer1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Observer Two
 * @author Ihor Savchenko
 * @version 1.0
 */
public class ObserverTwo implements ObserverReaction {

    private static final Logger logger = LoggerFactory.getLogger(ObserverTwo.class);
    private final String name = "ObserverTwo";

    @Override
    public void react(AtomicInteger currentState) {
        logger.info(name + " reacted on the event " + currentState);
    }
}
