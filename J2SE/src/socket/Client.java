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
import javax.swing.*;
import java.util.Scanner;
public class Client {
    public static void main(String[] args){
        try {
            Socket socket = new Socket("127.0.0.1", 9090);
            new SendThread(socket).start();
            new ReceiveThread(socket).start();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
