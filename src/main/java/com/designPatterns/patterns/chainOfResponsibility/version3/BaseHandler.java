package com.designPatterns.patterns.chainOfResponsibility.version3;

/**
 * Abstract class BaseHandler that implements typical methods
 * @author Ihor Savchenko
 * @version 1.0
 */
public abstract class BaseHandler implements ChainInterface {

    protected static int nextID = 1;
    protected ChainInterface nextInChain;

    public void add(ChainInterface next) {
        if (nextInChain == null) {
            nextInChain = next;
        } else {
            nextInChain.add(next);
        }
    }

    public void wrapAround(ChainInterface root) {
        if (nextInChain == null) {
            nextInChain = root;
        } else {
            nextInChain.wrapAround(root);
        }
    }

    public void execute(ChainInterface next) {

        boolean end = ((Handler)next).handle();

        if(!end) {
            execute(((Handler) next).nextInChain);
        }
    }
}
