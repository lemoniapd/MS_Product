package com.example.MS_Product.Models;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ProductForm {

    @Min(1)
    protected double price;

    @Size(min=2,max=50)
    protected String name;


}
