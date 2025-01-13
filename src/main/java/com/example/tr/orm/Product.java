package com.example.tr.orm;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products", schema = "production")
@Setter
@Getter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    
    @Column(nullable = false)
    private String productName;
    
    @Column(nullable = false)
    private int brandId;
    
    @Column(nullable = false)
    private int categoryId;
    
    @Column(nullable = false)
    private short modelYear;
    
    @Column(nullable = false)
    private double listPrice;

    // Getters and Setters
}
