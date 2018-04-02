package com.designPatterns.patterns.state.version1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Entry point for demonstrating the pattern - State.
 * All client requests to the wrapper class
 * are simply delegated to the current State object.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class EntryPoint {

    private static final Logger logger = LoggerFactory.getLogger(EntryPoint.class);

    public static void main( String[] args ) throws IOException {

        InputStreamReader is = new InputStreamReader(System.in);
        Chain chain = new Chain();
        while (true) {
            logger.info("Press 'Enter'");
            is.read();
            chain.pull();
        }
    }
}
