package com.designPatterns.patterns.visitor.visitor1;

/**
 * Interface with accept(Visitor) method
 * to the "element" hierarchy.
 * @author Ihor Savchenko
 * @version 1.0
 */
public interface Element {

    void accept(Visitor v);
}
