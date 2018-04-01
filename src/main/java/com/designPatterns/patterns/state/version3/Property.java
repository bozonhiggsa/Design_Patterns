package com.designPatterns.patterns.state.version3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Property class for demonstrating the State pattern.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Property {

    private static final Logger logger = LoggerFactory.getLogger(Property.class);
    private String name;
    private int price;
    private int rent;
    private Player owner;


    public Property(String name) {
        this.name = name;
        price = 100;
        rent = 10;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getRent() {
        return rent;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player p) {
        owner = p;
    }

    void landOnBy(Player p) {

        logger.info(p.getName() + " landed on " + name);
        if (getOwner() == null) {
            logger.info("- not owned " + p.getName());
            if (p.getWorth() < getPrice()) {
                logger.info("does not have enough money to purchase");
            } else {
                p.debit(getPrice());
                setOwner(p);
                logger.info("bought " + getName());
            }
        } else {
            logger.info("- owned by " + getOwner().getName());
            if (p != getOwner()) {
                p.debit(getRent());
                getOwner().credit(getRent());
                logger.info(getOwner().getName() + " now has "
                        + getOwner().getWorth() + " dollars");
            }
        }
        logger.info(p.getName() + " has " + p.getWorth()
                + " dollars");
    }
}
