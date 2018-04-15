package com.designPatterns.patterns.proxy;

/**
 * To support plug-compatibility between
 * the wrapper and the target, create an interface
 * @author Ihor Savchenko
 * @version 1.0
 */
public interface SocketInterface {

    String readLine();
    void  writeLine(String str);
    void  dispose();
}
