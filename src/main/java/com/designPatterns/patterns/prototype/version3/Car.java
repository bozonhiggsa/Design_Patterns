package com.designPatterns.patterns.prototype.version3;

/**
 * Abstract Superclass for cloneable objects that implements interface Cloneable
 * @author Ihor Savchenko
 * @version 1.0
 */
public abstract class Car implements Cloneable{

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public abstract String getModel();

    public abstract String result();
}
