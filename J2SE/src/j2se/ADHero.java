/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2se;

/**
 *
 * @author jiayuan
 */
public class ADHero extends Hero implements AD {
    public void physicalAttack(){
        System.out.println("physical attack");
    }
    public void attack(){
        System.out.println("hero attack");
    }
    public static void battleWin(){
        System.out.println("ad hero battle win");
    }
    public static void main(String []args){
        ADHero.battleWin();
        System.out.println(ADHero.x);
    }
    
}
