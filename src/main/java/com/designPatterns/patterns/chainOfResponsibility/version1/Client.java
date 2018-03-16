package com.designPatterns.patterns.chainOfResponsibility.version1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Client that uses the chain of a handlers
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);


    public static void main(String[] args) {

        Handler rootChain = new Handler();
        rootChain.add(new Handler());
        rootChain.add(new Handler());
        rootChain.add(new Handler());
        rootChain.wrapAround(rootChain);

        for (int i = 1; i < 6; i++) {
            logger.info("Operation #" + i + ":");
            rootChain.execute(i);
        }
    }
}
