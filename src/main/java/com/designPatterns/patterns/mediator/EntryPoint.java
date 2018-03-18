package com.designPatterns.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Entry point for analyzing the Mediator
 * @author Ihor Savchenko
 * @version 1.0
 */
public class EntryPoint {

    public static void main( String[] args ) {

        List<Thread> producerList = new ArrayList<>();
        Thread thread;
        Mediator mb = new Mediator();
        for(int i = 0; i < 3; i++){
            thread = new Thread(new Producer(mb));
            thread.setDaemon(true);
            producerList.add(thread);
        }
        for(int i = 0; i < 6; i++){
            thread = new Thread(new Consumer(mb));
            thread.setDaemon(true);
            producerList.add(thread);
        }

        producerList.forEach(Thread::start);

        try {
            Thread.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
