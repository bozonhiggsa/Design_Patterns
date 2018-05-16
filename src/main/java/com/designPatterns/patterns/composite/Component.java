package com.designPatterns.patterns.composite;

/**
 * "Lowest common denominator" interface that makes
 * containers and containees classes interchangeable.
 * It should specify the behavior that needs to be exercised uniformly
 * across all containee and container objects.
 * @author Ihor Savchenko
 * @version 1.0
 */
public interface Component {

    void traverse();
}
