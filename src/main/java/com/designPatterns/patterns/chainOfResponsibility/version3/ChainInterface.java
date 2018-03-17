package com.designPatterns.patterns.chainOfResponsibility.version3;

/**
 * Chain Interface for decoupling the Client and concrete handlers
 * @author Ihor Savchenko
 * @version 1.0
 */
public interface ChainInterface {

    void add(ChainInterface next);

    void wrapAround(ChainInterface root);

    void execute(ChainInterface next);
}
