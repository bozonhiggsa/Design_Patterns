package com.designPatterns.patterns.proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Create a "wrapper" for a remote,
 * or expensive, or sensitive target.
 * Encapsulate the complexity/overhead of the target in the wrapper.
 * The wrapper delegates to the target.
 * @author Ihor Savchenko
 * @version 1.0
 */
public class SocketProxy implements SocketInterface {

    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;

    public SocketProxy(String host, int port, boolean wait) {

        try {
            if (wait) {
                ServerSocket server = new ServerSocket(port);
                socket = server.accept();
            } else {
                socket = new Socket(host, port);
            }
            in  = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public String readLine() {

        String str = null;
        try {
            str = in.readLine();
        } catch( IOException e ) {
            e.printStackTrace();
        }
        return str;
    }

    public void writeLine(String str) {

        out.println(str);
    }

    public void dispose() {

        try {
            socket.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
