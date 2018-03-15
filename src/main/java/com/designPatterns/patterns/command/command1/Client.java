package com.designPatterns.patterns.command.command1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Client that uses commands
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {

        ReflectCommand[] reflectCommands = new ClientCreator().createCommands();

        logger.info("Reflection results:");

        for (ReflectCommand command: reflectCommands) {
            logger.info(command.execute().toString());
        }
    }
}
