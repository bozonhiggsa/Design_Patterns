package com.designPatterns.patterns.factoryMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Client that uses concrete images
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {

        Image image1 = getImage(Compression.COMPRESSION_OFF);
        logger.info("Image is supplied in format: " + image1.toString());
        Image image2 = getImage(Compression.COMPRESSION_ON);
        logger.info("Image is supplied in format: " + image2.toString());
    }

    static Image getImage(Compression compression){

        Image image = null;

        switch (compression) {
            case COMPRESSION_OFF:
                image = new RawImageReader().getImageSomeFormat();
                break;
            case COMPRESSION_ON:
                image = new JpegReader().getImageSomeFormat();
                break;
        }
        return image;
    }
}
