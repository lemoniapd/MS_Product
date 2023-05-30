package com.example.MS_Product.Models;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue
    protected Long id;
    @Min(1)
    protected double price;

    @Size(min=2,max=50)
    protected String name;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }
}