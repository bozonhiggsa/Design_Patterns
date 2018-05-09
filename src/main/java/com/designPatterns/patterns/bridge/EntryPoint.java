package com.designPatterns.patterns.bridge;

/**
 * Client that uses the bridge.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class EntryPoint {

    public static void main(String[] args) {

        Stack[] stacks = { new Stack("java"), new Stack("mine"),
                new StackHanoi("java"), new StackHanoi("mine") };
        for (int i=0, num; i < 20; i++) {
            num = (int)(Math.random() * 1000) % 40;
            for (Stack stack : stacks) {
                stack.push(num);
            }
        }
        for (int i=0, num; i < stacks.length; i++) {
            while (!stacks[i].isEmpty()) {
                System.out.print( stacks[i].pop() + "  ");
            }
            System.out.println();
        }
        System.out.println("total rejected is " + ((StackHanoi)stacks[3]).reportRejected());
    }
}
