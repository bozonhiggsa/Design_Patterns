package com.designPatterns.patterns.templateMethod.version1;

/**
 * Entry point for analyzing the Template Method
 * @author Ihor Savchenko
 * @version 1.0
 */
public class EntryPoint {

    public static void main(String[] args) {

        SuperiorAncestor superiorAncestor = new Successor();
        superiorAncestor.findSolution();
    }
}
