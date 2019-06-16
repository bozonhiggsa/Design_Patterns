package com.designPatterns.patterns.decorator.version1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * "Core" class with "is a" relationship.
 * Single core (or non-optional) component.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class TextField implements Widget {

    private static final Logger logger = LoggerFactory.getLogger(TextField.class);

    private int width, height;

    public TextField(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void draw() {
        logger.info("TextField: " + width + ", " + height);
    }
}
