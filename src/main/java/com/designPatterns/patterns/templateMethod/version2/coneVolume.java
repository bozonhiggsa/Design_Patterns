package com.designPatterns.patterns.templateMethod.version2;

/**
 * Concrete class for calculating a cone volume
 * @author Ihor Savchenko
 * @version 1.0
 */
public class ConeVolume extends CylinderVolume {

    @Override
    double formula(double radius, double height) {

        return super.formula(radius,height)/3;
    }
}
