/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author jiayuan
 */
import pojo.*; 
import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class TestHibernate {
    public static void main(String []args){
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        
        /* Create
            for(int i = 1;i <= 10; i++){
                Product p = new Product();
                p.setName("iphone" + i);
                p.setPrice(i*1000);
                s.save(p);
            }
        */
        Product p = (Product)s.get(Product.class, 29);
            System.out.println("id = 6" +p.getName());
        /*Read
            Product p = (Product)s.get(Product.class, 27);
            System.out.println("id = 6" +p.getName());
        */       
        /* Delete
            Product p = (Product)s.get(Product.class, 27);
            s.delete(p);
        */
        /* Update
            Product p =(Product) s.get(Product.class, 29);
            p.setName("galaxy");
            s.update(p);
        */
        /*
        Category c = new Category();
        c.setName("iphone5_category");
        s.save(c);
        Product p = (Product)s.get(Product.class, 31);
        p.setCategory(c);
        s.update(p);
        */
        
    /* 
        Category c = (Category)s.get(Category.class, 59);
        Set<Product> ps = c.getProducts();
        Product p1 = new Product();
        p1.setName("product_501");
        Product p2 = new Product();
        p2.setName("product_502");
        Product p3 = new Product();
        p3.setName("product_503");
        ps.add(p1); ps.add(p2); ps.add(p3);
        
        for(Product p : ps){
            System.out.println(p.getName());
        }
    
    /*
        Set<User> users = new HashSet<User>();
        for(int i = 0;i< 3 ;i++){
            User u = new User();
            u.setName("user" + i);
            users.add(u);
            s.save(u);
        }
        Product p1 = (Product)s.get(Product.class, 30);
        p1.setUsers(users);
    */ 
              

/*
        String name = "iphone";
        String sql = "select * from product p where p.name like '"+name+"%'";
        Query q= s.createSQLQuery(sql);
        List<Object[]> list= q.list();
        for (Object[] os : list) {
        for (Object filed: os) {
        System.out.print(filed+"\t");
        }
        System.out.println();
        }
*/

        s.getTransaction().commit();
        s.close();
        sf.close();
    }
}
