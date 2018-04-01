package com.designPatterns.patterns.templateMethod.version2;

/**
 * Concrete class for calculating a ball volume
 * @author Ihor Savchenko
 * @version 1.0
 */
public class BallVolume extends BaseCalculation {

    @Override
    double formula(double radius, double height) {

        return (4/3)*pi*calculateExtent(radius,3);
    }
}
