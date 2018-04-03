package com.designPatterns.patterns.prototype.version2;

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
        return this.MODEL;
    }

    @Override
    public String result() {

        return "Model " + this.MODEL + " was provided";
    }
}
