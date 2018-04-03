package com.designPatterns.patterns.visitor.version1;

/**
 * "visitor" interface with visit() methods
 * for every "element" type.
 * @author Ihor Savchenko
 * @version 1.0
 */
public interface Visitor {

    void visit(FirstElement firstElement);
    void visit(SecondElement secondElement);
    void visit(ThirdElement thirdElement);
}
