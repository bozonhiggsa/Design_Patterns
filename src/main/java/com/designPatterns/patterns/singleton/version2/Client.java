package com.designPatterns.patterns.singleton.version2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Client that use a singleton
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        logger.info("Is this the same object? : " + (singleton1 == singleton2));
    }
}
