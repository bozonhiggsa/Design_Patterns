package com.designPatterns.patterns.visitor.version2;

/**
 * Element and Visitor hierarchy together.
 * Interface with execute(Visitor) method.
 * Visitor with doJob() methods
 * for every "element" derived type.
 * Elements is also visitors for himself.
 * @author Ihor Savchenko
 * @version 1.0
 */
public interface Base {

    void execute(Base target);
    void doJob(FirstBaseImpl target);
    void doJob(SecondBaseImpl target);
    void doJob(ThirdBaseImpl target);
}
