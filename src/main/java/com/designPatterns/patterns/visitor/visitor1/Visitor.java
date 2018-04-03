package com.designPatterns.patterns.visitor.visitor1;

/**
 * Created by Garik on 4/3/2018.
 */
public interface Visitor {

    void visit(FirstElement firstElement);
    void visit(SecondElement secondElement);
    void visit(ThirdElement thirdElement);
}
