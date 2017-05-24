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
public class SetConnection {
    public static void main(String[] args) {
      try {
         Class.forName("org.postgresql.Driver");
         Connection con = DriverManager.getConnection(
                 "jdbc:postgresql://localhost:8080/testdb","postgres", "zheli");
         Statement stmt = con.createStatement();

         String query = "update emp set job = 'manager' where name = 'rioex'";
         String query3 = "insert into emp values( 1,'Jane','manager')";  
         stmt.execute(query3);
         
         stmt.execute("delete from emp where name = 'Jane'");
         
         /* 
	  con.setAutoCommit(false);
         PreparedStatement updateemp = con.prepareStatement(
            "insert into emp values(?,?,?)");
         updateemp.setInt(1,23);
         updateemp.setString(2,"Roshan");
         updateemp.setString(3, "jungle");
         updateemp.executeUpdate();
         Statement stmt = con.createStatement();
         con.commit(); 
         */
      
         ResultSet rs = stmt.executeQuery("SELECT * FROM emp ORDER BY id LIMIT 5");
         System.out.println("Id  Name  Job");
         while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String job = rs.getString("job");
            System.out.println(id+"   "+name+"    "+job);
         }
      } catch(SQLException e) {
         System.out.println("SQL exception occured" + e);
      } catch(ClassNotFoundException e) {
         System.out.println("Class not found "+ e);
      }
   }
}