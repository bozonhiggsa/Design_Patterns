package com.designPatterns.patterns.factoryMethod;

/**
 * Example of FactoryMethod for getting a JPEG images
 * @author Ihor Savchenko
 * @version 1.0
 */
public class JpegReader implements ImageReader {

    private Image image = new Image("JPEG");

    @Override
    public Image getImageSomeFormat() {
        return image;
    }
}
