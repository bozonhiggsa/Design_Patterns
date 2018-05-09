package com.designPatterns.patterns.factoryMethod;

/**
 * Model - Image
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Image {

    private String format;

    public Image(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return format;
    }
}
