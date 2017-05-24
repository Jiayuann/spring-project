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
import java.net.*;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SendThread extends Thread{
    private Socket socket;
    public SendThread(Socket socket){
        this.socket = socket;
    }
    public void run(){
        DataOutputStream dos;
        try {
            dos = new DataOutputStream(socket.getOutputStream());
            while(true){
                Scanner sc = new Scanner(System.in);
                String msg = sc.nextLine();
                dos.writeUTF(msg);
            }
        } catch (IOException ex) {
            Logger.getLogger(SendThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
