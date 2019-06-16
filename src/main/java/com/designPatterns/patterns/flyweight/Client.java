package com.designPatterns.patterns.flyweight;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

/**
 * The client must use the Factory instead of "new" to request objects.
 * Identify shareable and non-shareable state:
 * shareable - Button label, non-shareable - Button location.
 * The client (or a third party) must provide/compute the extrinsic state.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Client {

    public static void main( String[] args ) {
        Random rn = new Random();
        Frame frame = new Frame("Flyweight Demo");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setLayout(new GridLayout(10, 10));
        for (int i=0; i < 10; i++)
            for (int j=0; j < 10; j++)
                frame.add(FlyweightFactory.makeButton(
                        Integer.toString(rn.nextInt(15))));
        frame.pack();
        frame.setVisible( true );
        FlyweightFactory.report();
    }
}
