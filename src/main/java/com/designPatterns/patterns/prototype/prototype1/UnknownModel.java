package com.designPatterns.patterns.prototype.prototype1;

/**
 * Gauge for creating prototypes of Unknown Model
 * @author Ihor Savchenko
 * @version 1.0
 */
public class UnknownModel implements Car {

    private final String MODEL = "Unknown Model";

    @Override
    public Car clone() {
        return new UnknownModel();
    }

    @Override
    public String getModel() {
        return MODEL;
    }
}
