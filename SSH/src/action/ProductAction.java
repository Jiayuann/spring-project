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
 
import java.util.List;
import pojo.Product;
import service.ProductService;
 
public class ProductAction {
 
    ProductService productService;
    List<Product> products;
    Product product;

    public String list() {
    	products = productService.list();
    	return "listProduct";
    }	
    public String add(){
    	productService.add(product);
    	return "listProductAction";
    }
    public String edit(){
    	product = productService.get(product.getId());
    	return "editProduct";
    }
    public String delete(){
    	productService.delete(product);
    	return "listProductAction";
    }
    public String update(){
    	productService.update(product);
    	return "listProductAction";
    }
    public ProductService getProductService() {
    	return productService;
    }
    public void setProductService(ProductService productService) {
    	this.productService = productService;
    }
    public List<Product> getProducts() {
    	return products;
    }
    public void setProducts(List<Product> products) {
    	this.products = products;
    }
    public Product getProduct() {
    	return product;
    }
    public void setProduct(Product product) {
    	this.product = product;
    }
    public static void main(String []args){
        System.out.println("ff");
    }
}