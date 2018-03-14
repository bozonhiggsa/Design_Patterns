package com.designPatterns.patterns.prototype.prototype2;

/**
 * Gauge for creating prototypes of Audi
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Audi implements Car {

    private final String MODEL = "Audi";

    @Override
    public Car clone() {
        return new Audi();
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
