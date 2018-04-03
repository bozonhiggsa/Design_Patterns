package com.designPatterns.patterns.prototype.version2;

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

    public static void initializePrototypes(){
        registerPrototype(new Opel());
        registerPrototype(new Mazda());
        registerPrototype(new Audi());
    }

    public static Car getPrototype(String kind) {

        for (Car car: prototypes) {
            if(car.getModel().equals(kind)){
                return car.clone();
            }
        }
        return unknownModel.clone();
    }

    private static void registerPrototype(Car car){
        prototypes.add(car);
    }
}
