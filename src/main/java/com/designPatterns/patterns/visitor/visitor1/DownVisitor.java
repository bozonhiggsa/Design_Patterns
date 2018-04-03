package com.designPatterns.patterns.visitor.visitor1;

/**
 * Created by Garik on 4/3/2018.
 */
public class DownVisitor implements Visitor {

    public void visit(FirstElement firstElement) {
        System.out.println("do Down on " + firstElement.getFirstElement());
    }

    public void visit(SecondElement secondElement) {
        System.out.println("do Down on " + secondElement.getSecondElement());
    }

    public void visit(ThirdElement thirdElement) {
        System.out.println("do Down on " + thirdElement.getThirdElement());
    }
}
