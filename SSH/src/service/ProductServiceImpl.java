/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;
import dao.ProductDAO;
import pojo.Product;
public class ProductServiceImpl implements ProductService {
    ProductDAO productDAO;
    public ProductDAO getProductDAO() {
        return productDAO;
    }
    public void setProductDAO(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }
    
    public List<Product> list() {
        List<Product> products= productDAO.list();
        if(products.isEmpty()){
            for (int i = 0; i < 5; i++) {
                Product p = new Product();
                p.setName("product " + i);
                if(i == 2)
                    throw new RuntimeException();
                //一次性插入5条数据 否则一条也别插入的效果。
                productDAO.add(p);
                products.add(p);
            }
        }
        return products;
    }
    @Override
    public void add(Product p) {
    	productDAO.add(p);		
    }
    @Override
    public void update(Product p) {
    	productDAO.update(p);
    }
    @Override
    public void delete(Product p) {
    	productDAO.delete(p);
    }
    @Override
    public Product get(int id) {
    	return productDAO.get(id);
    } 
    
}