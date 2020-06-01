package service;

import api.ProductService;
import company.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kaczmarczyk on 2020-05-25.
 */
public class ProductServiceImp implements ProductService {

    List<Product> products;

    public ProductServiceImp(){
        products = new ArrayList<Product>();
    }

    public ProductServiceImp(List<Product> products) {
        this.products = products;
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Integer getCountProducts() {
        return products.size();
    }

    public Product getProductByProductName(String productName){
        for(Product product : products){
            if (product.getProductName().equals(productName)){
                return product;
            }
    }
        return null;
    }

    public boolean isProductOnWarehouse(String productName) {
        for(Product product : products){
            if (isProductExist(productName) && product.getProductCount() > 0){
                return true;
            }
        }
        return false;
    }

    public boolean isProductExist(String productName){
        for(Product product : products){
            if (product.getProductName().equals(productName)){
                return true;
            }
        }
        return false;
    }

    public boolean isProductExist(Long productId) {
        for(Product product : products) {
            if (product.getId().equals(productId)) {
                return true;
            }
        }
        return false;
    }
    }



