package com.designPatterns.patterns.visitor.version1;

/**
 * Derived class for Element.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class FirstElement implements Element {

    public void accept(Visitor v) {

        v.visit(this);
    }

    public String getFirstElement() {

        return "FirstElement";
    }
}
