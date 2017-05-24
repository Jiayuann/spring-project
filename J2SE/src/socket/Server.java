/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

/**
 *
 * @author jiayuan
 */
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Server {
    public static void main(String []args){
        try {
            ServerSocket server = new ServerSocket(9090);
            System.out.println("监听在端口号:9090");
            Socket socket = server.accept();
            new SendThread(socket).start();
            new ReceiveThread(socket).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
