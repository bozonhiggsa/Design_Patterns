package com.designPatterns.patterns.strategy;

/**
 * Client that use a Strategy.
 * Client uses the interface of an interchangeable family of algorithms.
 * Clients of the algorithm couple themselves strictly to the interface.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Client {

    private static void execute(Strategy strategy) {

        strategy.solve();
    }

    public static void main( String[] args ) {

        Strategy[] algorithms = {new StrategySolutionImpl(), new StrategySearchImpl()};
        for (Strategy algorithm : algorithms) {
            execute(algorithm);
        }
    }
}
