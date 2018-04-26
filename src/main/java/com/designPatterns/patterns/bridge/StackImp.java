package com.designPatterns.patterns.bridge;

/**
 * Interface/wrapper class that "has a"
 * implementation object and delegates all requests to it.
 *
 * @author Ihor Savchenko
 * @version 1.0
 */
public interface StackImp {

    Object push(Object o);
    Object peek();
    boolean empty();
    Object pop();
}
