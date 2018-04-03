package com.designPatterns.patterns.visitor.version2;

/**
 * Interface with execute(Visitor) method
 * to the "element" hierarchy.
 * @author Ihor Savchenko
 * @version 1.0
 */
public interface Base {

    void execute(Base target);
    void doJob(FirstBaseImpl target);
    void doJob(SecondBaseImpl target);
    void doJob(ThirdBaseImpl target);
}
