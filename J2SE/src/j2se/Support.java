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
public class Support extends Hero {
    private Support(){}
    private static Support instance = new Support();
    public Support getInstance(){
        return instance;
    }
    public void attack(){
        
    }
    public void heal(){
        System.out.println("An anonymous heal");
    }
    public void heal(Hero h1){
        System.out.println(this.name + "heal" + h1.name);
    }
    public void heal(Hero h1, int hp){
        System.out.println("A heal" + h1.name + "with hp" + hp);
    }
    
    public static void main(String []args){
        Support bh = new Support();
        bh.name = "赏金猎人";
 

    }
    
}