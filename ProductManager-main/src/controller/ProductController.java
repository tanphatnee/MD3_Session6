package controller;

import model.Product;
import service.ProductService;
/** class controller có chức năng chính là điều hướng từ service ra view */
public class ProductController {
    private ProductService productService = new ProductService();
    public Product[] getAll(){
        return productService.getListProduct();
    }
    public boolean createProduct(Product p){
        return productService.create(p);
    }
    public Product findById(int id){
        return productService.findById(id);
    }
    public void update(Product p){
        productService.update(p);
    }
    public void delete(int id){
        productService.delete(id);
    }
    public int getSize(){
        return productService.getSize();
    }
}
