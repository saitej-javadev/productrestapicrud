package com.saitej.productrestapi.productrestapicrud.services;

import com.saitej.productrestapi.productrestapicrud.entities.Product;

import java.util.List;

public interface ProductService {
    public Product saveProduct(Product product);
    public List<Product> saveProducts(List<Product> products);
    public Product getProductById(Long id);
    public Product getProductByName(String name);
    public List<Product> getAllProducts();
    public Product updateProduct(Product product);
    public void deleteProductById(Long id);
}
