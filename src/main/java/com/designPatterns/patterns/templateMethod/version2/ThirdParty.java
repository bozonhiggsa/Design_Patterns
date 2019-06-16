package com.designPatterns.patterns.templateMethod.version2;

import java.util.Set;

/**
 * Third party class for setting algorithms and accessing
 * to a set of algorithms.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class ThirdParty {

    Creator creator = new Creator();

    void setAlgorithms(){
        creator.setAlgorithm(new BallSurface());
        creator.setAlgorithm(new BallVolume());
        creator.setAlgorithm(new CylinderVolume());
        creator.setAlgorithm(new ConeVolume());
    }

    Set<BaseCalculation> getAlgorithms(){
        return creator.getAlgorithms();
    }
}
