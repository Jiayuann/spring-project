/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_exception;

/**
 *
 * @author jiayuan
 */
import java.io.*;
import java.util.*;
public class ByteStream {
    private static void split(File f, int eachSize){
        try{
            FileInputStream fis = new FileInputStream(f);
            byte []all = new byte[(int)f.length()];
            fis.read(all);
            for(byte b:all)
                System.out.println(b);
            
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    public static void main(String []args){
        int eachSize = 50 * 1024;
        File f = new File("/Users/jiayuan/Downloads/untitled/ClassAPI.java");
        split(f,eachSize);
    }
}
