package com.designPatterns.patterns.visitor.version1;

/**
 * Derived class for Element.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class ThirdElement implements Element {

    public void accept(Visitor v) {

        v.visit(this);
    }

    public String getThirdElement() {

        return "ThirdElement";
    }
}
