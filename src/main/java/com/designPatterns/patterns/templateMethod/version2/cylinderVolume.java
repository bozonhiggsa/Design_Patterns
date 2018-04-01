package com.designPatterns.patterns.templateMethod.version2;

/**
 * Concrete class for calculating a cylinder volume
 * @author Ihor Savchenko
 * @version 1.0
 */
public class CylinderVolume extends BaseCalculation {

    @Override
    double formula(double radius, double height) {

        return height*pi*calculateExtent(radius,2);
    }
}
