package com.flapkap.Vendingmachine.service.impl;

import com.flapkap.Vendingmachine.model.Product;
import com.flapkap.Vendingmachine.repository.ProductRepository;
import com.flapkap.Vendingmachine.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        // Additional validation or business logic can be added here
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        // Additional validation or business logic can be added here
        return productRepository.save(product);
    }

    @Override
    public Product getProduct(Long productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + productId));
    }

    @Override
    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }
}
