package com.designPatterns.patterns.templateMethod.version2;

import java.util.HashSet;
import java.util.Set;

/**
 * Class that creates a set of algorithms
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Creator {

    Set<BaseCalculation> algorithms = new HashSet<>();

    void setAlgorithm(BaseCalculation algorithm){

        algorithms.add(algorithm);
    }

    Set<BaseCalculation> getAlgorithms(){

        return algorithms;
    }

}
