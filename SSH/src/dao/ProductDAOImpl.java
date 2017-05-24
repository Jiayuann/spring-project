/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jiayuan
 */

package dao;
import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;
import dao.ProductDAO;
import pojo.Product;
public class ProductDAOImpl extends HibernateTemplate implements ProductDAO{    
    public List<Product> list() {
        return find("from Product");
    } 
    @Override
    public void add(Product p) {
    	save(p);
    }
    @Override
    public Product get(int id) {
    	return (Product)get(Product.class,id);
    }
    @Override
    public void update(Product p) {
    	super.update(p);		
    }
    @Override
    public void delete(Product p) {
    	super.delete(p);
    }
}