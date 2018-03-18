package com.designPatterns.patterns.mediator;

/**
 * Third party participant that promotes the many-to-many relationships
 * between interacting peers - Consumers and Producers
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Mediator {

    private boolean slotFull = false;
    private int number;

    public synchronized void storeMessage(int num) {
        while (slotFull) {
            try {
                wait();
            }
            catch (InterruptedException e ) {
                Thread.currentThread().interrupt();
            }
        }
        slotFull = true;
        number = num;
        notifyAll();
    }

    public synchronized int retrieveMessage() {
        while (!slotFull) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        slotFull = false;
        notifyAll();
        return number;
    }
}
