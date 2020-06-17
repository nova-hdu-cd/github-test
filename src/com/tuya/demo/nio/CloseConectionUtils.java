package com.tuya.demo.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author chendong
 * @date 2020/6/17 3:29 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class CloseConectionUtils {

    public static void close(PrintWriter out, Socket socket, BufferedReader in) {

        if (out != null) {
            out.close();
            out = null;
        }
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            in = null;
        }
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            socket = null;
        }
    }
    
}
