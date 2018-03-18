package com.designPatterns.patterns.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Producer that interacts with the Mediator only.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Producer implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);
    private static int num = 1;
    private Mediator mediator;
    private int id;

    public Producer(Mediator m) {
        mediator = m;
        id = num++;
    }

    @Override
    public void run() {
        int num;
        while (true) {
            mediator.storeMessage(num = (int)(Math.random()*100));
            logger.info("   producer " + id + " produced the message - " + num);
        }
    }
}
