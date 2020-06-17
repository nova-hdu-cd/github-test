package com.tuya.demo.nio;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author chendong
 * @date 2020/6/17 3:13 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class TimeClient {
    public static void main(String[] args) {
        int port = 8080;
        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            socket = new Socket("127.0.0.1", port);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            //客户端向服务端发数据
            out.println("query time order11");
            //客户端读取服务端的数据
            String response = in.readLine();
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            CloseConectionUtils.close(out, socket, in);
        }
    }
}
