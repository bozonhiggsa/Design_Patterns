package com.designPatterns.patterns.bridge;

/**
 * Interface/wrapper class that "has a"
 * implementation object and delegates all requests to it.
 *
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Stack {

    protected StackImp imp;
    public Stack(String s) {
        if (s.equals("java")) {
            imp = new StackJava();
        }
        else {
            imp = new StackMine();
        }
    }
    public Stack() {
        this("java");
    }

    public void push(int in) {

        imp.push(in);
    }

    public int pop() {

        return (Integer) imp.pop();
    }

    public boolean isEmpty() {

        return imp.empty();
    }
}
