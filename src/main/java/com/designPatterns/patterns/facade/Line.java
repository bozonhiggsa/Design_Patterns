package com.designPatterns.patterns.facade;

/**
 * The facade captures the complexity
 * and collaborations of the subsystems, and delegates
 * to the appropriate methods of the wrapper.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Line {

    private Point o, e;

    public Line(Point ori, Point end) {
        o = ori;
        e = end;
    }

    public void  move(int x, int y) {
        o.move(x, y);
        e.move(x, y);
    }

    public void  rotate(int angle) {
        e.rotate(angle, o);
    }

    public String toString() {
        return "origin is " + o + ", end is " + e;
    }
}
