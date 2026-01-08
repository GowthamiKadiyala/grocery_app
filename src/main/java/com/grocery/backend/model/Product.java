package com.grocery.backend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category; // e.g., "Fruits", "Sweets", "Packed"
    private BigDecimal price;
    private String imageUrl;
    private int stockQuantity;
    private String description;
}