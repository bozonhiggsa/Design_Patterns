package com.designPatterns.patterns.templateMethod;

/**
 * Specialization
 * @author Ihor Savchenko
 * @version 1.0
 */
public abstract class Specialization extends Generalization {

    protected void stepThr() {
        step3_1();
        step3_2();
        step3_3();
    }

    private void step3_1() {
        System.out.println("Specialization.step3_1");
    }

    abstract protected void step3_2();

    private void step3_3() {
        System.out.println("Specialization.step3_3");
    }
}
