/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_exception;

import java.io.*;

/**
 *
 * @author jiayuan
 */
public class BufferedStream {
    
    public static void main(String []args){
        try{
            File src = new File("/Users/jiayuan/Downloads/untitled/src.java");
            File dest = new File("/Users/jiayuan/Downloads/untitled/dest.java");
            BufferedReader br = new BufferedReader(new FileReader(src));
            BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
            String msg = null;
            while((msg = br.readLine()) != null){
                System.out.println(msg);
                if(!msg.trim().startsWith("//")){
                    bw.append(msg);
                    bw.newLine();
                }
                
            }
            bw.flush();
            bw.close();
            br.close();
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
