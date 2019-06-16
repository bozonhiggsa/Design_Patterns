package com.designPatterns.patterns.prototype.version1;

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
        Car car1 = CarsFactory.getPrototype("Opel");
        logger.info("Cars factory made a prototype of the : " + car1.getModel());
        Car car2 = CarsFactory.getPrototype("Mazda");
        logger.info("Cars factory made a prototype of the : " + car2.getModel());
        Car car3 = CarsFactory.getPrototype("Audi");
        logger.info("Cars factory made a prototype of the : " + car3.getModel());
        Car car4 = CarsFactory.getPrototype("Dodge");
        logger.info("Cars factory made a prototype of the : " + car4.getModel());

    }
}
