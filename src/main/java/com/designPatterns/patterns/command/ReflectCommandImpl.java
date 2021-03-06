package com.designPatterns.patterns.command;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Concrete class that encapsulates in its objects all of the following:
 * a target object, a method name, and some arguments.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class ReflectCommandImpl implements ReflectCommand {

    private Object receiver;
    private Method action;
    private Object[] args;

    public ReflectCommandImpl(Object obj, String methodName, Object[] arguments) {
        this.receiver = obj;
        this.args = arguments;
        Class cls = obj.getClass();
        Class[] argTypes = new Class[args.length];
        for (int i = 0; i < args.length; i++) {
            argTypes[i] = args[i].getClass();
        }
        try {
            action = cls.getMethod(methodName, argTypes);
        } catch(NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public Object execute() {
        try {
            action.invoke(receiver, args);
            return receiver.getClass().getMethod("getState").invoke(receiver);
        }
        catch(IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}
