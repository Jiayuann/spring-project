/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author jiayuan
 */
import java.sql.*;
import java.util.*;
public class HeroDAO {
    public HeroDAO(){
        try{
            Class.forName("org.postgresql.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }    
    }
    public Connection getConnection()throws SQLException{
        return DriverManager.getConnection(
                "jdbc:postgresql://localhost:8080/emp","postgres", "zheli");
    }
    public int getTotal(){
        int total = 0;
        try(Connection c = getConnection(); Statement s = c.createStatement();){
            String sql = "select count(*) form hero";
            ResultSet rs = s.executeQuery(sql);
            while(rs.next()){
                total += rs.getInt(1);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return total;
    }
    public void add(Hero hero){
        String sql = "insert into hero(name,hp,damage) values(?, ?, ?)";
        try(Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql);){
            ps.setString(1, hero.name);
            ps.setFloat(2,hero.hp);
            ps.setInt(3,hero.damage);
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                int id = rs.getInt(1);
                hero.id = id;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void update(Hero hero){
        String sql = "update hero set name= ?, hp = ? , damage = ? where id = ?";
        try(Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql);){
            ps.setString(1, hero.name);
            ps.setFloat(2,hero.hp);
            ps.setInt(3,hero.damage);
            ps.setInt(4,hero.id);
            ps.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public void delete(int id){
        try(Connection c = getConnection();Statement s= c.createStatement()){
            String sql = "delete from hero where id=" + id;
            s.execute(sql);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public Hero get(int id) {
        Hero hero = null;
  
        try (Connection c = getConnection(); Statement s = c.createStatement();) {
  
            String sql = "select * from hero where id = " + id;
  
            ResultSet rs = s.executeQuery(sql);
  
            if (rs.next()) {
                hero = new Hero();
                String name = rs.getString(2);
                float hp = rs.getFloat("hp");
                int damage = rs.getInt(4);
                hero.name = name;
                hero.hp = hp;
                hero.damage = damage;
                hero.id = id;
            }
  
        } catch (SQLException e) {
  
            e.printStackTrace();
        }
        return hero;
    }
    public List<Hero> list() {
        return list(0, Short.MAX_VALUE);
    }
    public List<Hero> list(int start, int count) {
        List<Hero> heros = new ArrayList<Hero>();
        String sql = "select * from hero order by id desc limit ? offset ?";
        try (Connection c = getConnection(); PreparedStatement ps = c.prepareStatement(sql);) {
            ps.setInt(1, count);
            ps.setInt(2, start);
            ResultSet rs = ps.executeQuery(); 
            while (rs.next()) {
                Hero hero = new Hero();
                int id = rs.getInt(1);
                String name = rs.getString(2);
                float hp = rs.getFloat("hp");
                int damage = rs.getInt(4);
                hero.id = id;
                hero.name = name;
                hero.hp = hp;
                hero.damage = damage;
                heros.add(hero);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return heros;
    }

}
