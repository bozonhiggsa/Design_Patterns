package com.designPatterns.patterns.prototype.prototype3;

/**
 * Gauge for creating prototypes of Audi
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Audi extends Car {

    private final String MODEL = "Audi";

    @Override
    public String getModel() {
        return this.MODEL;
    }

    @Override
    public String result() {

        return "Model " + this.MODEL + " was provided";
    }
}
