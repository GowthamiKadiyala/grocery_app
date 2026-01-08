package com.grocery.backend.repository;

import com.grocery.backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // This allows the app to fetch ONLY "Fruits" or ONLY "Sweets"
    List<Product> findByCategory(String category);
}