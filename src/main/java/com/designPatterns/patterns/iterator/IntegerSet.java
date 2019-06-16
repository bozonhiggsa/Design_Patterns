package com.designPatterns.patterns.iterator;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.NoSuchElementException;

/**
 * Collection class includes a createIterator() method.
 * Iterator realized as an internal "iterator" class into the collection class.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class IntegerSet {

    private Hashtable hashtable = new Hashtable();

    public void add(int in) {
        hashtable.put(in, "null");
    }

    public boolean isMember(int i) {
        return hashtable.containsKey(i);
    }

    public Hashtable getHashtable() {
        return hashtable;
    }

    public Iterator createIterator()  {
        return new Iterator(this);
    }

    public static class Iterator {
        private IntegerSet set;
        private Enumeration e;
        private Integer current;

        public Iterator(IntegerSet in) {
            set = in;
        }

        public void first() {
            e = set.hashtable.keys();
            next();
        }

        public boolean isDone() {
            return current == null;
        }

        public int currentItem() {
            return current;
        }

        public void  next() {
            try {
                current = (Integer)e.nextElement();
            } catch (NoSuchElementException e) {
                current = null;
            }
        }
    }
}
