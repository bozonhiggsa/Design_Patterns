package com.designPatterns.patterns.visitor.version1;

/**
 * "Visitor" interface with visit() methods
 * for every "element" derived type.
 * The Visitor hierarchy is coupled to each Element derived class
 * @author Ihor Savchenko
 * @version 1.0
 */
public interface Visitor {

    void visit(FirstElement firstElement);
    void visit(SecondElement secondElement);
    void visit(ThirdElement thirdElement);
}
