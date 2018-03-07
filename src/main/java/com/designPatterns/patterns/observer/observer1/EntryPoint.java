package com.designPatterns.patterns.observer.observer1;

/**
 * Entry point for analyzing the design pattern Observer
 * @author Ihor Savchenko
 * @version 1.0
 */
public class EntryPoint {

    public static void main(String[] args) {

        EventSource eventSource = EventSourceImpl.getInstance();

        ObserverReaction observer1 = new ObserverOne();
        ObserverReaction observer2 = new ObserverTwo();
        ObserverReaction observer3 = new ObserverThree();

        eventSource.removeObserver(observer1);
        eventSource.addObserver(observer1);
        eventSource.addObserver(observer1);
        eventSource.addObserver(observer2);
        eventSource.addObserver(observer3);

        eventSource.eventHappened();
        eventSource.eventHappened();

        eventSource.removeObserver(observer1);

        eventSource.eventHappened();
        eventSource.eventHappened();
        eventSource.eventHappened();
    }
}
