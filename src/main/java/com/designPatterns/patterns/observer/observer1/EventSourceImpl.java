package com.designPatterns.patterns.observer.observer1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Implementation of a concrete event source
 * This class based on Singleton pattern
 * @author Ihor Savchenko
 * @version 1.0
 */
public class EventSourceImpl implements EventSource {

    private final static EventSourceImpl INSTANCE = new EventSourceImpl();
    private List<ObserverReaction> observers = new ArrayList<>();
    private AtomicInteger currentState = new AtomicInteger(0);

    private EventSourceImpl() {
    }

    public static EventSourceImpl getInstance(){
        return INSTANCE;
    }

    public AtomicInteger getCurrentState() {
        return currentState;
    }

    @Override
    public void addObserver(ObserverReaction observer) {

        if(observers.contains(observer)){
            return;
        }

        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverReaction observer) {

        if(!observers.contains(observer)){
            return;
        }

        observers.remove(observer);
    }

    @Override
    public void eventHappened() {

        currentState.incrementAndGet();

        for (ObserverReaction observer: observers) {

            observer.react(getCurrentState());
        }
    }
}
