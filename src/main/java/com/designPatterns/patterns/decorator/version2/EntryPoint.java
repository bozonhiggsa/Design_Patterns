package com.designPatterns.patterns.decorator.version2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The client configures the type and ordering of
 * Core and Decorator objects.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class EntryPoint extends Decorator {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public EntryPoint(LCD inner) {
        super(inner);
    }

    public static void main(String[] args) {
        LCD stream = new EntryPoint(new Scramble(new Core()));
        String[] str = {""};
        stream.write(str);
        System.out.println("main:     " + str[0]);
        stream.read(str);
    }

    public void write(String[] s) {
        System.out.print("PASSWORD: ");
        try {
            in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        super.write( s );
    }

    public void read(String[] s) {
        System.out.print("PASSWORD: ");
        try {
            in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        super.read(s);
    }
}
