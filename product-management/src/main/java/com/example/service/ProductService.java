package com.example.service;

import com.example.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
    private List<Product> productList;
    private static ProductService productService = new ProductService();
    public static ProductService getProductService(){
        return productService;
    }
    public ProductService(){
        productList = new ArrayList<>();
        Product p1 = new Product("Tu lanh",10,500.0);
        Product p2 = new Product("Ti vi", 20,300.0);
        Product p3 = new Product("may giat", 20,600.0);
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public void edit(Product product) {
        productList.add(product);
    }

    @Override
    public void delete(Product product) {
        productList.remove(product);
    }

    @Override
    public void view(Product product) {

    }


    @Override
    public List<Product> findAll() {
        List<Product> list = new ArrayList<>();
        for (Product p: productList){
            list.add(p);
    }
        return list;
    }

    @Override
    public Product findById(int id) {
        Product product = null;
        for (Product p: productList){
            if(p.getId() == id){
                product = p;
                break;
            }
        }
        return product;
    }


}
