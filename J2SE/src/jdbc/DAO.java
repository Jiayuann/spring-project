/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

/**
 *
 * @author jiayuan
 */
public interface DAO {
    public void add(Hero hero);
    public void update(Hero hero);
    public void delete(int id);
    public Hero get(int id);
}
