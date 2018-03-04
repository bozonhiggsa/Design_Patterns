package com.designPatterns.patterns.factoryMethod;

/**
 * Example of FactoryMethod for getting a RAW images
 * @author Ihor Savchenko
 * @version 1.0
 */
public class RawImageReader implements ImageReader {

    private Image image = new Image("RAW");

    @Override
    public Image getImageSomeFormat() {
        return image;
    }
}
