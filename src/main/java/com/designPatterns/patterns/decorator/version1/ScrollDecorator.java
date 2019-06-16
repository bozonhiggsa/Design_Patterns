package com.designPatterns.patterns.decorator.version1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Decorator derived class for optional embellishment.
 * The Decorator derived classes implement their wrapper functionality,
 * delegate to the Decorator base class and add extra stuff.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class ScrollDecorator extends Decorator {

    private static final Logger logger = LoggerFactory.getLogger(ScrollDecorator.class);

    public ScrollDecorator(Widget widget) {
        super(widget);
    }

    public void draw() {
        super.draw();
        logger.info("  ScrollDecorator");
    }
}
