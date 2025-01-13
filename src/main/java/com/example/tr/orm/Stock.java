package com.example.tr.orm;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "stocks", schema = "production")
@IdClass(StockId.class)
@Setter
@Getter
public class Stock {

    @Id
    private int storeId;

    @Id
    private int productId;

    private Integer quantity;

    // Getters and Setters
}
