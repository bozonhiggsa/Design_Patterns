package com.designPatterns.patterns.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Consumer that interacts with the Mediator only.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Consumer implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);
    private static int num = 1;
    private Mediator mediator;
    private int id;

    public Consumer(Mediator m) {
        mediator = m;
        id = num++;
    }

    @Override
    public void run() {
        while (true) {
            logger.info("   consumer" + id + " consumed the message - " + mediator.retrieveMessage());
        }
    }
}
