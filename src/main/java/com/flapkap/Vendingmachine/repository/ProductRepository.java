package com.flapkap.Vendingmachine.repository;

import com.flapkap.Vendingmachine.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional methods if needed
}