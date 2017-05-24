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
public class Hero {
    public String name;
    protected float hp;
    public Hero(String name, float hp){
        this.name = name;
        this.hp = hp;
    }
    public void attackHero(Hero h)throws EnemyHeroException{
        if(h.hp == 0){
            throw new EnemyHeroException(h.name + "already dead");
        }
    }
    class EnemyHeroException extends Exception{
        public EnemyHeroException(){
            
        }
        public EnemyHeroException(String msg){
            super(msg);
        }
    }
    public static void main(String []args){
        Hero garen = new Hero("garen",12);
        Hero teemo = new Hero("Teemo", 0);
        try{
            garen.attackHero(teemo);
        }catch(EnemyHeroException e){
            e.printStackTrace();
        }
    }
    
}
