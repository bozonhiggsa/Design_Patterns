package com.designPatterns.patterns.decorator.version1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Decorator derived class for optional embellishment.
 * Decorator derived classes delegate to base class and add extra stuff.
 *
 * @author Ihor Savchenko
 * @version 1.0
 */
public class BorderDecorator extends Decorator {

    private static final Logger logger = LoggerFactory.getLogger(BorderDecorator.class);

    public BorderDecorator(Widget widget) {

        super(widget);
    }

    public void draw() {

        super.draw();
        logger.info("  BorderDecorator");
    }
}
