package com.designPatterns.patterns.prototype.prototype2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Client that uses prototypes of cars
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);


    public static void main(String[] args) {

        CarsFactory.initializePrototypes();
        Car car1 = CarsFactory.getPrototype("Opel");
        logger.info(car1.result());
        Car car2 = CarsFactory.getPrototype("Mazda");
        logger.info(car2.result());
        Car car3 = CarsFactory.getPrototype("Audi");
        logger.info(car3.result());
        Car car4 = CarsFactory.getPrototype("Dodge");
        logger.info(car4.result());

    }
}
