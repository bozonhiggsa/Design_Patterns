package com.designPatterns.patterns.visitor.visitor1;

/**
 * Created by Garik on 4/3/2018.
 */
public class UpVisitor implements Visitor {

    public void visit(FirstElement firstElement) {
        System.out.println("do Up on " + firstElement.getFirstElement());
    }

    public void visit(SecondElement secondElement) {
        System.out.println("do Up on " + secondElement.getSecondElement());
    }

    public void visit(ThirdElement thirdElement) {
        System.out.println( "do Up on " + thirdElement.getThirdElement() );
    }
}

