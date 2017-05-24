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
public class TestFile {
    static long minSize = Integer.MAX_VALUE;
    static long maxSize = 0;
    static File minFile = null;
    static File maxFile = null;
    public static void findFile(File f){
        if(f.isDirectory()){
            for(File f1: f.listFiles()){
                findFile(f1);
            }
        }else{
            if(f.length() < minSize){
                minSize = f.length();
                minFile = f;
            }
            if(f.length() > maxSize){
                maxSize = f.length();
                maxFile = f;
            }
        }
    }
    public static void main(String []args){
        File f = new File("/Users/jiayuan/Downloads/untitled");
        System.out.println(f.getAbsolutePath());
        findFile(f);
        System.out.println(maxFile);
        System.out.println(minFile);
    }
}
