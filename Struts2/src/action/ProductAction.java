/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

/**
 *
 * @author jiayuan
 */
import pojo.*;
import dao.*;
import java.util.*;
import java.util.Map;
import com.opensymphony.xwork2.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.ServletActionContext;
public class ProductAction extends ActionSupport{
    public Product product;
    public List<Product> products;
    public ProductDAO pdao = new ProductDAO();
    public Product getProduct(){
        return product;
    }
    public void setProduct(){
        this.product = product;
    } 
    public List<Product> getProducts(){
        return products;
    }
    public void setProducts(List<Product> products){
        this.products = products;
    }
    
    
    
//    public void validate(){
//        if(product.getName().length() == 0){
//            addFieldError("product.name","name can't be empty");
//        }
//    }
    public String add(){
       pdao.add(product);
       return "list";
    }
    public String delete(){
        pdao.delete(product.getId());
        return "list";
    }
    public String update(){
        pdao.update(product);
        return "list";
    }
    public String edit(){
        product = pdao.get(product.getId());
        return "edit";
    }
    
    public String list(){
       products = pdao.listProduct();
       return "listJSP";
    }
    public String show(){
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();
        System.out.println("request:\t" + request);
        System.out.println("response:\t" + response);
        product = new Product();
        product.setName("ip7");
        return "show_message";       
    }
}
