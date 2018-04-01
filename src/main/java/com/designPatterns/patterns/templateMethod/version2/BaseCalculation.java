package com.designPatterns.patterns.templateMethod.version2;

/**
 * Base class that implements part of a functionality
 * @author Ihor Savchenko
 * @version 1.0
 */
public abstract class BaseCalculation {

    double pi = 3.14;

    double calculateExtent(double number, int extent){

        double result = 1.0;
        int i = 1;
        while(i<=extent){
            result = result * number;
            i++;
        }
        return result;
    }

    double algorithm(double radius, double height){

        return formula(radius, height);
    }

    abstract double formula(double radius, double height);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseCalculation that = (BaseCalculation) o;

        return Double.compare(that.pi, pi) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(pi);
        return (int) (temp ^ (temp >>> 32));
    }
}
