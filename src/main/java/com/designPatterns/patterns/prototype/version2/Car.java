package com.designPatterns.patterns.prototype.version2;

/**
 * Interface for cloneable objects
 * @author Ihor Savchenko
 * @version 1.0
 */
public interface Car {

    Car clone();

    String getModel();

    String result();
}
