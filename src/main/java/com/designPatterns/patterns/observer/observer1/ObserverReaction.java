package com.designPatterns.patterns.observer.observer1;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Interface for Observers
 * @author Ihor Savchenko
 * @version 1.0
 */
public interface ObserverReaction {

    void react(AtomicInteger currentState);

}
