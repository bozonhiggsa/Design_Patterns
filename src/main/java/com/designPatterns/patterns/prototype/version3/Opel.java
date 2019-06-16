package com.designPatterns.patterns.prototype.version3;

/**
 * Gauge for creating prototypes of Opel
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Opel extends Car {

    private final String MODEL = "Opel";

    @Override
    public String getModel() {
        return this.MODEL;
    }

    @Override
    public String result() {
        return "Model " + this.MODEL + " was provided";
    }
}
