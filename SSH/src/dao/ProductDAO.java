/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author jiayuan
 */

import java.util.List;
import pojo.Product;
public interface ProductDAO {
     
    public List<Product> list();
    public void add(Product p);
    public Product get(int id);
    public void update(Product p);
    public void delete(Product p);	
}