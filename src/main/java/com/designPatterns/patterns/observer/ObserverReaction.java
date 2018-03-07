package com.designPatterns.patterns.observer;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Interface for Observers
 * @author Ihor Savchenko
 * @version 1.0
 */
@FunctionalInterface
public interface ObserverReaction {

    void react(AtomicInteger currentState);

}
