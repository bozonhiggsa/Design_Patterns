package com.designPatterns.patterns.templateMethod.version2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

/**
 * Client that uses algorithms without having a knowledge
 * about their implementations
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {

        ThirdParty thirdParty = new ThirdParty();
        thirdParty.setAlgorithms();
        Set<BaseCalculation> algorithms = thirdParty.getAlgorithms();
        for (BaseCalculation algorithm: algorithms) {
            logger.info("Formula calculating result is " + String.valueOf(algorithm.algorithm(10, 1)));
        }
    }
}
