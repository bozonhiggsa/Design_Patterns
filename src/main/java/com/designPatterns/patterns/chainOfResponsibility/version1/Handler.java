package com.designPatterns.patterns.chainOfResponsibility.version1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * Handler from a chain of responsibility
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Handler {

    private static final Logger logger = LoggerFactory.getLogger(Handler.class);
    private final static Random RANDOM = new Random();
    private static int nextID = 1;
    private int id = nextID++;
    private Handler nextInChain;

    public void add(Handler next) {
        if (nextInChain == null) {
            nextInChain = next;
        } else {
            nextInChain.add(next);
        }
    }

    public void wrapAround(Handler root) {
        if (nextInChain == null) {
            nextInChain = root;
        } else {
            nextInChain.wrapAround(root);
        }
    }

    public void execute(int num) {
        if (RANDOM.nextInt(4) != 0) {
            logger.info("   " + id + "-busy  ");
            nextInChain.execute(num);
        } else {
            logger.info("   " + id + "-handled-" + num);
        }
    }
}
