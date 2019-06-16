package com.designPatterns.patterns.abstractFactory;

import com.designPatterns.patterns.abstractFactory.interfaces.AbstractFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * Client that uses concrete products
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        MDC.put("LOGGER_ID","entity");

        AbstractFactory factory = AbstractFactory.getFactory(TypeOfProduct.PRODUCT1);

        logger.info("Factory is created");

        MDC.put("LOGGER_ID","service");

        factory.createA();
        factory.createB();

        logger.info("Factory provides service with Product1 for WidgetA and WidgetB");

        MDC.put("LOGGER_ID","entity");

        factory = AbstractFactory.getFactory(TypeOfProduct.PRODUCT2);

        logger.info("Factory is created");

        MDC.put("LOGGER_ID","service");

        factory.createA();
        factory.createB();

        logger.info("Factory provides service with Product2 for WidgetA and WidgetB");
    }
}
