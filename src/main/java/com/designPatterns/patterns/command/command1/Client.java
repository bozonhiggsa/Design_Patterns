package com.designPatterns.patterns.command.command1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Client that creates a number of commands
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {

        SimpleCommand[] simpleCommands = {new SimpleCommand(4), new SimpleCommand(7)};
        logger.info("Normal call results:");
        simpleCommands[0].add(5);
        logger.info(Integer.toString(simpleCommands[0].getState()));
        simpleCommands[1].addTwoOperands(3, 2);
        logger.info(Integer.toString(simpleCommands[1].getState()));

        ReflectCommand[] reflectCommands = {
                new ReflectCommand(simpleCommands[0], "add", new Integer[] {5}),
                new ReflectCommand(simpleCommands[1], "addTwoOperands", new Integer[] {6, 9})
        };
        logger.info("Reflection results:");

        for (ReflectCommand command : reflectCommands) {
            logger.info(command.execute().toString());
        }
    }
}
