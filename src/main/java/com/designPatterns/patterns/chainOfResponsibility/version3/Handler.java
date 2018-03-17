package com.designPatterns.patterns.chainOfResponsibility.version3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * Handler from a chain of responsibility
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Handler extends BaseHandler {

    private static final Logger logger = LoggerFactory.getLogger(Handler.class);
    private final static Random RANDOM = new Random();
    private int id = nextID++;

    public boolean handle() {
        if (RANDOM.nextInt(4) != 0) {
            logger.info("   " + id + "-busy");
            return false;
        } else {
            logger.info("   " + id + "-handled");
            return true;
        }
    }
}
