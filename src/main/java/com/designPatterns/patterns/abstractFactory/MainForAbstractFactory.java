package com.designPatterns.patterns.abstractFactory;

/**
 * Entry point
 * @author Ihor Savchenko
 * @version 1.0
 */
public class MainForAbstractFactory {

    public static void main(String[] args) {

        Client client = new Client();

        client.setFactory1();

        client.getFactory().createA().methodA();
        client.getFactory().createB().methodB();

        client.setFactory2();

        client.getFactory().createA().methodA();
        client.getFactory().createB().methodB();

    }
}
