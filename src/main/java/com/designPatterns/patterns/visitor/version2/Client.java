package com.designPatterns.patterns.visitor.version2;

/**
 * Client that uses the Visitor pattern.
 * Client creates "visitor" objects and passes each to execute() calls.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {

        Base objects[] = {new FirstBaseImpl(), new SecondBaseImpl(), new ThirdBaseImpl()};
        for (Base object : objects) {
            for (int j = 0; j < 3; j++) {
                object.execute(objects[j]);
            }
        }
    }
}
