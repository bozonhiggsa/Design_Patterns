package com.designPatterns.patterns.adapter;

/**
 * The client uses (is coupled to) the new interface.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Client {

    public static void main( String[] args ) {

        RoundHole roundHole = new RoundHole(5);
        SquarePegAdapter squarePegAdapter;
        for (int i = 6; i < 10; i++) {
            squarePegAdapter = new SquarePegAdapter((double)i);
            squarePegAdapter.makeFit(roundHole);
        }
    }
}
