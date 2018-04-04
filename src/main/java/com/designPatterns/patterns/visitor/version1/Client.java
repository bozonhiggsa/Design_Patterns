package com.designPatterns.patterns.visitor.version1;

/**
 * Client that uses the Visitor pattern.
 * The client creates Visitor objects and passes each
 * to Element objects by calling accept().
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Client {

    public static void main( String[] args ) {

        Element[] list = {new FirstElement(), new SecondElement(), new ThirdElement()};
        UpVisitor up = new UpVisitor();
        DownVisitor down = new DownVisitor();
        for (Element element : list) {
            element.accept(up);
        }
        for (Element element : list) {
            element.accept(down);
        }
    }
}
