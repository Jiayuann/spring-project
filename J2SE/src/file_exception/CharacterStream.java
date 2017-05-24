package file_exception;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jiayuan
 */
import java.io.*;
public class CharacterStream {
    public static void main(String []args){
        File src = new File("/Users/jiayuan/Downloads/untitled/src.java");
        File dest = new File("/Users/jiayuan/Downloads/untitled/dest.java");
        try{
            FileReader in = new FileReader(src);
            FileWriter out = new FileWriter(dest);
            int temp;
            while((temp = in.read()) > 0){
                out.write(temp);
            }
            in.close();
            out.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
