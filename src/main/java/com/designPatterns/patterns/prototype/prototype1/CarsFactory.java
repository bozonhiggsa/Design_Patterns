package com.designPatterns.patterns.prototype.prototype1;

import java.util.ArrayList;
import java.util.List;

/**
 * Factory that registers initial objects for prototyping and
 * creates prototypes
 * @author Ihor Savchenko
 * @version 1.0
 */
public class CarsFactory {

    private static final List<Car> prototypes = new ArrayList();
    private final static UnknownModel unknownModel = new UnknownModel();

    static {
        prototypes.add(new Opel());
        prototypes.add(new Mazda());
        prototypes.add(new Audi());
    }

    public static Car getPrototype(String type) {

        for (Car car: prototypes) {
            if(car.getModel().equals(type)){
                return car.clone();
            }
        }
        return unknownModel.clone();
    }
}
