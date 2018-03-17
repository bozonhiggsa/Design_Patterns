package com.designPatterns.patterns.chainOfResponsibility.version2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ConcurrentModificationException;

/**
 * Client that uses the chain of a handlers
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);


    public static void main(String[] args) {

        BaseHandler baseHandler = new BaseHandler();

        baseHandler.setHandlers(new Handler(1));
        baseHandler.setHandlers(new Handler(2));
        baseHandler.setHandlers(new Handler(3));
        baseHandler.setHandlers(new Handler(4));
        baseHandler.setHandlers(new Handler(5));
        baseHandler.setHandlers(new Handler(6));

        try{
            baseHandler.execute();
        }
        catch (ConcurrentModificationException e){
            logger.info("----------------------------------------");
            logger.info("ConcurrentModificationException appeared");
        }
    }
}
