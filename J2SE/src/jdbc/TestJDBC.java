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
public class TestJDBC {
    public static Hero get(int id){
        Hero hero = null;
         try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:8080/testdb","postgres", "zheli");
            Statement stmt = con.createStatement();
            String query = "select * from emp where id = " + id;
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()){
                hero = new Hero(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("job"));
            }
            
         }catch(SQLException e) {
         System.out.println("SQL exception occured" + e);
        } catch(ClassNotFoundException e) {
           System.out.println("Class not found "+ e);
        }
         return hero;
    }
    public static void main(String []args){
        System.out.println(get(3).name);
    }
    
    
}
