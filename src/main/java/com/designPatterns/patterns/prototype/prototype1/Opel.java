package com.designPatterns.patterns.prototype.prototype1;

/**
 * Gauge for creating prototypes of Opel
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Opel implements Car {

    private final String MODEL = "Opel";

    @Override
    public Car clone() {
        return new Opel();
    }

    @Override
    public String getModel() {
        return MODEL;
    }
}
