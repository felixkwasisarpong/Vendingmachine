package com.flapkap.Vendingmachine.controller;


import com.flapkap.Vendingmachine.model.Product;
import com.flapkap.Vendingmachine.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        String loggedInUsername = SecurityContextHolder.getContext().getAuthentication().getName();
        if ("seller".equals(loggedInUsername)) {
            return productService.createProduct(product);
        } else {
            throw new SecurityException("Only the seller can create a product.");
        }
    }

    @GetMapping("/{productId}")
    public Product getProduct(@PathVariable Long productId) {
        return productService.getProduct(productId);
    }

    @PutMapping("/{productId}")
    public Product updateProduct(@PathVariable Long productId, @RequestBody Product product) {
        String loggedInUsername = SecurityContextHolder.getContext().getAuthentication().getName();
        Product existingProduct = productService.getProduct(productId);
        if ("seller".equals(loggedInUsername) && loggedInUsername.equals(existingProduct.getId().toString())) {
            product.setId(productId);
            return productService.updateProduct(product);
        } else {
            throw new SecurityException("Only the seller who created the product can update it.");
        }
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable Long productId) {
        String loggedInUsername = SecurityContextHolder.getContext().getAuthentication().getName();
        Product existingProduct = productService.getProduct(productId);
        if ("seller".equals(loggedInUsername) && loggedInUsername.equals(existingProduct.getId().toString())) {
            productService.deleteProduct(productId);
        } else {
            throw new SecurityException("Only the seller who created the product can delete it.");
        }
    }
    // Other methods...
}

