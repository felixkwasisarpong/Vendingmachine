package com.flapkap.Vendingmachine.service;

import com.flapkap.Vendingmachine.model.Product;

public interface ProductService {
    Product createProduct(Product product);
    Product updateProduct(Product product);
    Product getProduct(Long productId);
    void deleteProduct(Long productId);
}
