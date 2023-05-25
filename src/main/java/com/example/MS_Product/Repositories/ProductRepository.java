package com.example.MS_Product.Repositories;

import com.example.MS_Product.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
