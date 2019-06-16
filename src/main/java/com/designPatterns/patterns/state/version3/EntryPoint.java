package com.designPatterns.patterns.state.version3;

/**
 * Entry point for demonstrating the pattern - State.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class EntryPoint {

    public static void main(String[] args) {
        Player p1 = new Player("Tom", 50);
        Player p2 = new Player("Dick", 500);
        Property prop = new Property("Boardwalk");
        prop.landOnBy(p1);
        prop.landOnBy(p2);
        prop.landOnBy(p1);
        prop.landOnBy(p2);
        prop.landOnBy(p1);
    }
}
