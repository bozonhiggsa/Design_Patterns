package com.designPatterns.patterns.chainOfResponsibility.version3;

/**
 * Client that uses the chain of a handlers
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        ChainInterface rootChain = new ChainCreator().createChain(5);

        rootChain.execute(rootChain);
    }
}

