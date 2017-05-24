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
public class Weapon extends Item{
    int damage;
    public static void main(String []args){
        Weapon infiniteEdge = new Weapon();
        infiniteEdge.damage = 65;
        infiniteEdge.name = "sword";
        infiniteEdge.price = 3300;
    }
}
