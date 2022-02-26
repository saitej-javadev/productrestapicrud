package com.saitej.productrestapi.productrestapicrud.services;

import com.saitej.productrestapi.productrestapicrud.entities.Product;
import com.saitej.productrestapi.productrestapicrud.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private  ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> saveProducts(List<Product> products) {

        return productRepository.saveAll(products);
    }

    @Override
    public Product getProductById(Long id) {

        return productRepository.findById(id).get();
    }

    @Override
    public Product getProductByName(String name) {

        return productRepository.getByName(name);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(Product product) {

        return productRepository.save(product);
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);

    }
}
