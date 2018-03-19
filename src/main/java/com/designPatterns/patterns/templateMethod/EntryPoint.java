package com.designPatterns.patterns.templateMethod;

/**
 * Entry point for analyzing the Template Method
 * @author Ihor Savchenko
 * @version 1.0
 */
public class EntryPoint {

    public static void main(String[] args) {
        Generalization algorithm = new Realization();
        algorithm.findSolution();
    }
}
