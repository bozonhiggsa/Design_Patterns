package com.designPatterns.patterns.templateMethod.version2;

/**
 * Concrete class for calculating a ball surface
 * @author Ihor Savchenko
 * @version 1.0
 */
public class BallSurface extends BaseCalculation {

    @Override
    double formula(double radius, double height) {

        return 4*pi*calculateExtent(radius,2);
    }
}
