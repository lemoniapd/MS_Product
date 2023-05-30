package com.example.MS_Product.Controllers;

import com.example.MS_Product.Models.Product;
import com.example.MS_Product.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ProductController {

    private final ProductRepository productRepo;

    public ProductController(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    @RequestMapping("/all")
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @RequestMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productRepo.findById(id).orElse(null);
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping("/add")
    public String addProduct(@RequestBody @Valid ProductForm productForm) {
        Product product = new Product();
        product.setName(productForm.getName());
        product.setPrice(productForm.getPrice());
        productRepo.save(product);
        return product.getName() + " is added to database";
    }

}