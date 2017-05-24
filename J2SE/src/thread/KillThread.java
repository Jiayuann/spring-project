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
public class KillThread extends Thread{
    private Hero h1;
    public KillThread(Hero h1, Hero h2){
        this.h1 = h1;
    }
    public static void main(String []args){
        Hero garen = new Hero("garen",550,40);
        int n = 10;
        Thread []addThreads = new Thread[n];
        Thread []reduceThread = new Thread[n];
        for(int i = 0; i < n; i++){
            Thread t = new Thread(){
                public void run(){
                    synchronized(garen){
                        garen.recover();
                    }
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            };
            t.start();
            addThreads[i] = t;
        }
        for(int i = 0; i < n; i++){
            Thread t = new Thread(){
                public void run(){
                    synchronized(garen){
                        garen.hurt();
                    }
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
                
            };
            t.start();
            reduceThread[i] = t;
        }
        
        
     
   
    }
}
