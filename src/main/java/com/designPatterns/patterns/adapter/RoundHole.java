package com.designPatterns.patterns.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The NEW component.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class RoundHole {

    private static final Logger logger = LoggerFactory.getLogger(RoundHole.class);
    private final int radius;

    public RoundHole(int radius) {

        this.radius = radius;
        logger.info("RoundHole: max SquarePeg is " + radius * Math.sqrt(2));
    }

    public int getRadius() {

        return radius;
    }
}

