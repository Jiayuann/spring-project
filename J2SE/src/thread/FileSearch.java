/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author jiayuan
 */
import java.io.*;
public class FileSearch extends Thread {
    private File currentFile;
    private String key;
    public FileSearch(File currentFile,String key){
        this.currentFile = currentFile;
        this.key = key;
    }
    public static void search(File folder, String key){
        if(folder.isDirectory()){
            for(File f: folder.listFiles())
                search(f,key);
        }else{
            new FileSearch(folder,key).start();
        }
    }
    public void run(){
        try{
            BufferedReader br = new BufferedReader(new FileReader(currentFile));
            String temp = null;
            while((temp = br.readLine()) !=  null){
                if(temp.toLowerCase().contains(key.toLowerCase()))
                    System.out.println("find string" + temp + " " + currentFile);

            }
            br.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    public static void main(String []args){
        File folder = new File("/Users/jiayuan/Downloads/untitled");
        search(folder,"magic");
    }
}
