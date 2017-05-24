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
public class TestSocket {
    public static void getLocalAddress() throws UnknownHostException{
        InetAddress host = InetAddress.getLocalHost();
        String ip = host.getHostAddress();
        System.out.println("local ip = " + ip);
    }
    public static void main(String []args) throws IOException{
        Process p = Runtime.getRuntime().exec("ping www.baidu.com");
        String inputLine = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        while((inputLine = br.readLine()) != null){
            System.out.println(inputLine);
        }
        br.close();
    }
}
