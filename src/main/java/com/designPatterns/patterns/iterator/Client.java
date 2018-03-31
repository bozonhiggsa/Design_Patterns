package com.designPatterns.patterns.iterator;

import java.util.Enumeration;

/**
 * Client that uses a collection class.
 * Client asks the collection object to create an iterator object.
 * Client uses the first(), isDone(), next(), and currentItem() protocol
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Client {

    public static void main( String[] args ) {

        IntegerSet set = new IntegerSet();
        for (int i=2; i < 10; i += 2) set.add(i);
        for (int i=1; i < 9; i++)
            System.out.print( i + "-" + set.isMember(i) + "  " );

        IntegerSet.Iterator iter1 = set.createIterator();
        IntegerSet.Iterator iter2 = set.createIterator();

        System.out.print( "\nIterator:    " );
        for ( iter1.first(), iter2.first();  ! iter1.isDone();  iter1.next(), iter2.next() )
            System.out.print( iter1.currentItem() + " " + iter2.currentItem() + "  " );

        System.out.print( "\nEnumeration: " );
        for (Enumeration e = set.getHashtable().keys(); e.hasMoreElements(); )
            System.out.print( e.nextElement() + "  " );
    }
}
