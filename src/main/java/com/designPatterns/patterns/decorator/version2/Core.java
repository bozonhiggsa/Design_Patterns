package com.designPatterns.patterns.decorator.version2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The Core class inherits from the LCD interface.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Core implements LCD {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public void write(String[] s) {

        System.out.print("INPUT:    ");
        try {
            s[0] = in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void read(String[] s) {

        System.out.println("Output:   " + s[0]);
    }
}
