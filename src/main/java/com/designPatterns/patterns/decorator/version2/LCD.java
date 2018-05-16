package com.designPatterns.patterns.decorator.version2;

/**
 * "Lowest Common Denominator" interface that makes
 * all classes interchangeable.
 * @author Ihor Savchenko
 * @version 1.0
 */
public interface LCD {

    void write(String[] s);
    void read(String[] s);
}
