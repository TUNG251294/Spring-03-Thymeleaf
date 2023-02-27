package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface IProductService {
    void save(Product product);
    void edit(Product product);
    void delete(Product product);
    void view(Product product);
    List<Product> findAll();
    Product findById(int id);
}
