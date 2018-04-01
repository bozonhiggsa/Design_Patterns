package com.designPatterns.patterns.state.version3;

/**
 * Player class for demonstrating the State pattern.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Player {

    private String name;
    private int money;

    public Player(String n, int m) {
        name = n;
        money = m;
    }

    public String getName() {
        return name;
    }

    public int getWorth() {
        return money;
    }

    public void debit(int m) {
        money -= m;
    }

    public void credit(int m) {
        money += m;
    }
}
