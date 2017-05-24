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
public class LockThread {
    public static void main(String []args){
        final Hero ahri = new Hero("ahri",500,20);
        final Hero annie = new Hero("annie",450,40);
        
        Thread t1 = new Thread(){
            public void run(){
                synchronized(ahri){
                    System.out.println("t1 have ahri");
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("t1 试图占有安妮");
                    System.out.println("t1 等待中 。。。。");
                    synchronized(annie){
                        System.out.println("try to occupy annie");
                    }
                }
            }
        };
        t1.start();
        Thread t2 = new Thread(){
            public void run(){
                synchronized(annie){
                    System.out.println("t1 have annie");
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                    System.out.println("t2 试图占有九尾妖狐");
                    System.out.println("t2 等待中 。。。。");
                    synchronized(ahri){
                        System.out.println("try to occupy ahri");
                    }
                }
            }
        };
        t2.start();
                
    }
    
    
}
