package com.designPatterns.patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Concrete implementation for StrategySearch
 * @author Ihor Savchenko
 * @version 1.0
 */
@SuppressWarnings("ALL")
public class StrategySearchImpl extends StrategySearch {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);
    private int state = 1;

    protected void preProcess()  {

        logger.info("PreProcess");
    }

    protected void postProcess() {

        logger.info("PostProcess");
    }

    protected boolean search() {

        logger.info("Search-" + state++);
        return state == 3 ? true : false;
    }
}
