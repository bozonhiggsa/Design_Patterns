package com.designPatterns.patterns.visitor.version1;

/**
 * Element hierarchy.
 * Interface with accept(Visitor) method.
 * Element hierarchy is coupled only to the Visitor base class.
 * @author Ihor Savchenko
 * @version 1.0
 */
public interface Element {

    void accept(Visitor v);
}
