package com.designPatterns.patterns.observer;

/**
 * Interface for events sources
 * This class based on Singleton pattern
 * @author Ihor Savchenko
 * @version 1.0
 */
public interface EventSource {

    void addObserver(ObserverReaction observer);

    void removeObserver(ObserverReaction observer);

    void eventHappened();

}
