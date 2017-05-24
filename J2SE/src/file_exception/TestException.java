/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_exception;

/**
 *
 * @author jiayuan
 * Error stackoverflow error, outofmemory error
 * Nullpointer IndexOutofBoundary
 */
import java.io.*;
public class TestException {
    public static void method() throws Throwable{
        File f = new File("User/web.jpg");
        new FileInputStream(f);
        
    }
    public static void main(String []args){
        File f = new File("User/web.exe");
        try{
            System.out.println("open file");
            new FileInputStream(f);
        }catch(FileNotFoundException e){
            System.out.println("not found");
            e.printStackTrace();
        }
        
    }
    
}
