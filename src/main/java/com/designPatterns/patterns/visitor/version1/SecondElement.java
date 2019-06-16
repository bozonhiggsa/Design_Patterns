package com.designPatterns.patterns.visitor.version1;

/**
 * Derived class for Element.
 * The implementation in each Element derived class
 * is always the same - accept(Visitor v) {v.visit( this);}.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class SecondElement implements Element {

    public void accept( Visitor v ) {
        v.visit( this );
    }

    public String getSecondElement() {
        return "SecondElement";
    }
}
