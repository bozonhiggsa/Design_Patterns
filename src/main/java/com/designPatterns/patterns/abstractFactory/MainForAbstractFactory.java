package com.designPatterns.patterns.abstractFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * Entry point
 * @author Ihor Savchenko
 * @version 1.0
 */
public class MainForAbstractFactory {

    private static final Logger logger = LoggerFactory.getLogger(MainForAbstractFactory.class);

    public static void main(String[] args) {

        MDC.put("LOGGERID","entity");

        Client client = new Client();

        logger.info("Client is created");

        MDC.put("LOGGERID","service");

        client.setFactory1();

        logger.info("Factory 1 is ready");

        client.getFactory().createA().methodA();
        client.getFactory().createB().methodB();

        client.setFactory2();

        logger.info("Factory 1 is ready");

        client.getFactory().createA().methodA();
        client.getFactory().createB().methodB();

    }
}
