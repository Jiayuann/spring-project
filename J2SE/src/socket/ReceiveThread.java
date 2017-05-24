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
import java.util.Scanner;
import java.io.*;
import java.net.*;
public class ReceiveThread extends Thread{
    private Socket socket;
    public ReceiveThread(Socket socket){
        this.socket = socket;
    }
    
    public void run(){
        try {
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            while (true) {
                String msg = dis.readUTF();
                System.out.println(msg);
            }
        } catch (IOException iOException) {
        }
    }
}
