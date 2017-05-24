/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2se;

/**
 * lazy initialization & eager initialization
 * @author jiayuan
 */
public class GiantDragon{
    private GiantDragon(){};
    private static GiantDragon instance = new GiantDragon();
    public GiantDragon getInstance(){
        return instance;
    }
}