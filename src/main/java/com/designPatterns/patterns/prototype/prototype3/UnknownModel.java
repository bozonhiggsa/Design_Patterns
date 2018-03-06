package com.designPatterns.patterns.prototype.prototype3;

/**
 * Gauge for creating prototypes of Unknown Model
 * @author Ihor Savchenko
 * @version 1.0
 */
public class UnknownModel extends Car {

    private final String MODEL = "Unknown Model";

    @Override
    public String getModel() {
        return this.MODEL;
    }

    @Override
    public String result() {

        return "Model " + this.MODEL + " was provided";
    }
}
