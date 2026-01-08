package com.grocery.backend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerEmail;
    private BigDecimal totalAmount;
    private String status; 
    private LocalDateTime orderDate;

    @ElementCollection
    private List<String> itemNames;
}