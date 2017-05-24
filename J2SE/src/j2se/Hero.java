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
public abstract class Hero{
    String name;
    float hp;
    float armor;
    int moveSpeed;
    class BattleScore{
        int kill;
        int die;
        int assit;
        public void legendary(){
            if(kill > 8)
                System.out.println("super legend");
        }
    }
    public abstract void attack();
    public static void main(String []args){
        ADHero garen = new ADHero();
        garen.name = "garen";
        BattleScore score = garen.new BattleScore();
        score.kill = 9;
        score.legendary();
        Hero h = new Hero(){
            public void attack(){
                System.out.println("new attck");
            }
            
        };
 
        h.attack();
        
    }
}
