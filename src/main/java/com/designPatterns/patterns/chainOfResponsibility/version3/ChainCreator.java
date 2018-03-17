package com.designPatterns.patterns.chainOfResponsibility.version3;

/**
 * Creator of a Chain of Responsibility
 * @author Ihor Savchenko
 * @version 1.0
 */
public class ChainCreator {

    public ChainInterface createChain(int size){

        ChainInterface rootChain = new Handler();
        for(int i = 0; i < size; i++){
            rootChain.add(new Handler());
        }
        rootChain.wrapAround(rootChain);
        return rootChain;
    }
}
