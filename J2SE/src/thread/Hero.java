package thread;

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
public class Hero {
    public String name;
    public float hp;
    public int damage;
    public Hero(String name, float hp, int damage){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
    public synchronized void hurt(){
        if(hp == 1){
            try{
                this.wait();
                
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        hp -= 1;
        System.out.printf("hurt %s 's hp is %.0f%n", name,hp);
    }
    public synchronized void recover(){
   
            hp += 5;
            System.out.printf("recover %s 's hp is %.0f%n", name,hp);
            this.notify();

    }
    public void attackHero(Hero h){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        h.hp -= damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
        if(h.isDead())
            System.out.println(h.name +"lost the game");
    }
    public void a_dugen(){
        int count = 3;
        while(count > 0){
            try{
                System.out.printf("a_dugen no.%d", count);
                Thread.sleep(1000);
                count -= 1;
                if(count == 0){
                    System.out.println("5 sec new command");
                    Thread.sleep(3000);
                    count = 3;
                }
                
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
            
            
        }
    }
    public boolean isDead(){
        return hp <= 0;
    }
}
