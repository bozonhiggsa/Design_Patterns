package com.designPatterns.patterns.prototype.version3;

/**
 * Gauge for creating prototypes of Mazda
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Mazda extends Car {

    private final String MODEL = "Mazda";

    @Override
    public String getModel() {
        return this.MODEL;
    }

    @Override
    public String result() {

        return "Model " + this.MODEL + " was provided";
    }
}
