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
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class HeroDAO implements DAO{
    Connection con;
    
    public HeroDAO(){
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:8080/testdb","postgres", "zheli");  
        } catch(ClassNotFoundException e) {
           System.out.println("Class not found "+ e);
        } catch (SQLException ex) {
            Logger.getLogger(HeroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void add(Hero hero){}
    public void update(Hero hero){}
    public void delete(int id){}
    public Hero get(int id){
        return null;
    }

    
}
