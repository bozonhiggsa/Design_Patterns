package com.designPatterns.patterns.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Entry point for analyzing the design pattern Observer
 * One of the observers is based on an anonymous class
 * and another observer is based on an anonymous class with the use of Lambda
 * @author Ihor Savchenko
 * @version 1.0
 */
public class EntryPoint {

    private static final Logger logger = LoggerFactory.getLogger(EntryPoint.class);

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

        eventSource.addObserver(new ObserverReaction() {
            @Override
            public void react(AtomicInteger currentState) {
                logger.info("Observer based on an anonymous class reacted on the event " + currentState);
            }
        });

        eventSource.addObserver(currentState -> logger.info("Observer based on an Lambda reacted on the event "
                                                                                               + currentState));

        eventSource.addObserver(EntryPoint::lambdaMethod);



        eventSource.eventHappened();
        eventSource.eventHappened();

        eventSource.removeObserver(observer1);

        eventSource.eventHappened();
        eventSource.eventHappened();
        eventSource.eventHappened();
    }

    private static void lambdaMethod(AtomicInteger currentState){
        logger.info("Observer based on an Lambda :: reacted on the event " + currentState);
    }
}
