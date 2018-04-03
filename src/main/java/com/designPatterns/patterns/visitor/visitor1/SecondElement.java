package com.designPatterns.patterns.visitor.visitor1;

/**
 * Derived class for Element.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class SecondElement implements Element {

    public void   accept( Visitor v ) {

        v.visit( this );
    }

    public String getSecondElement() {

        return "SecondElement";
    }
}
