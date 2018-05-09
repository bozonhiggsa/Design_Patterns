package com.designPatterns.patterns.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * "Wrapper" class that can "impedance match" the old to the new.
 * The adapter/wrapper class "has a" instance of the legacy class.
 * The adapter/wrapper class delegates to the legacy object.
 * Identify the desired interface.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class SquarePegAdapter {

    private static final Logger logger = LoggerFactory.getLogger(SquarePegAdapter.class);
    private final SquarePeg squarePeg;

    public SquarePegAdapter(double w) {

        squarePeg = new SquarePeg(w);
    }

    public void makeFit(RoundHole roundHole) {

        double amount = squarePeg.getWidth() - roundHole.getRadius() * Math.sqrt(2);
        logger.info("reducing SquarePeg " + squarePeg.getWidth() + " by " +
                ((amount < 0) ? 0 : amount) + " amount");
        if (amount > 0) {
            squarePeg.setWidth(squarePeg.getWidth() - amount);
            logger.info("   width is now " + squarePeg.getWidth());
        }
    }
}
