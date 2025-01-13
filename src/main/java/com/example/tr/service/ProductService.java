package com.example.tr.service;


import com.example.tr.orm.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(int productId);
    Product createProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(int productId);
}
