package com.tuya.demo.nio;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author chendong
 * @date 2020/6/17 2:46 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class TimeServer {
    public static void main(String[] args) throws IOException {
        int port = 8080;
        //服务端连接
        ServerSocket server = null;
        try {
            //绑定端口号
            server = new ServerSocket(port);
            System.out.println("The time server is start in port " + port);
            Socket socket = null;
            //服务端通过无限循环来监听客户端的连接
            while (true) {
                socket = server.accept();
                new Thread(new TimeServerHandler(socket)).start();
            }
        } finally {
            if (server != null) {
                System.out.println("The time server is close !");
                server.close();
                server = null;
            }
        }
    }
}
