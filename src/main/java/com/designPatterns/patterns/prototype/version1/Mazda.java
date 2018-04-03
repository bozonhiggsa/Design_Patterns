package com.designPatterns.patterns.prototype.version1;

/**
 * Gauge for creating prototypes of Mazda
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Mazda implements Car {

    private final String MODEL = "Mazda";

    @Override
    public Car clone() {
        return new Mazda();
    }

    @Override
    public String getModel() {
        return MODEL;
    }
}
