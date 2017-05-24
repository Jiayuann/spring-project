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
import java.util.*;
public class ThreadPool {
    int threadPoolSize;
    LinkedList<Runnable> tasks = new LinkedList<Runnable>();
    public ThreadPool(){
        threadPoolSize = 10;
        synchronized(tasks){
            for(int i = 0; i< threadPoolSize; i++){
                new TaskConsumeThread("new Consumer thread" + i).start();
            }
        }
    }
    public void add(Runnable r){
        synchronized(tasks){
            tasks.add(r);
            tasks.notifyAll();
        }
    }
    class TaskConsumeThread extends Thread{
        Runnable task;
        public TaskConsumeThread(String name){
            super(name);
        }
        public void run(){
            System.out.println("start this" + this.getName());
            while(true){
                synchronized(tasks){
                    while(tasks.isEmpty()){
                        try{
                            tasks.wait();
                        }catch(InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                task = tasks.removeLast();
                tasks.notifyAll();
                }
            System.out.println(this.getName() + "get this task");
            task.run();
            }
        }
        
    }
}
