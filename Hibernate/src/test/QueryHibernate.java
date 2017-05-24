package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jiayuan
 */
import pojo.*; 
import org.hibernate.*;
import java.util.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
public class QueryHibernate {
    public static void main(String []args){
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();
        

            Session s1 = sf.openSession();
            Session s2 = sf.openSession();
            s1.beginTransaction();
            s2.beginTransaction();
            Product p1 = (Product) s1.get(Product.class, 29);
            System.out.println("产品原本价格是: " + p1.getPrice());
            p1.setPrice(p1.getPrice() + 1000);
            Product p2 = (Product) s2.get(Product.class, 29);
            p2.setPrice(p2.getPrice() + 1000);
            s1.update(p1);
            s2.update(p2);
            s1.getTransaction().commit();
            s2.getTransaction().commit();
            Product p = (Product) s1.get(Product.class, 29); 
            System.out.println("经过两次价格增加后，价格变为: " + p.getPrice());
            s1.close();
            s2.close();
        
        
        s.getTransaction().commit();
        s.close();
        sf.close();
        
    }
}
