package com.designPatterns.patterns.visitor.visitor1;

/**
 * Created by Garik on 4/3/2018.
 */
public class FirstElement implements Element {

    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getFirstElement() {

        return "FirstElement";
    }
}
