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
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.*;
import service.*;
import java.util.*;
import dao.*;
public class TestSpring {
    public static void main(String []args){
        ApplicationContext context = new ClassPathXmlApplicationContext(
            new String[] { "applicationContext.xml" });
//        Category c = (Category)context.getBean("c");
//        System.out.println(c.getName());
        
        Product p = (Product)context.getBean("p");
        System.out.println(p.getName());
        System.out.println(p.getCategory().getName());      
//        ProductService s = (ProductService)context.getBean("s");
//        s.doService();
        CategoryDAO dao = (CategoryDAO) context.getBean("dao");
        
         
        //增加
        Category c = new Category();
        c.setName("category yyy");
        dao.save(c);
         
        //获取
        Category c2 = dao.get(Category.class, 39);
         
        //修改
        c2.setName("category zzz");
        dao.update(c2);
        
        DetachedCriteria dc = DetachedCriteria.forClass(Category.class);
        List<Category> cs_1= dao.find("from Category c");
       
        
        int start =5;//从多少开始查询
        List<Category> cs_2= dao.findByCriteria(dc,start,5);
        System.out.println(cs_2);
        for(Category i:cs_2){
            System.out.println(i.getName());
        }
    }
}
