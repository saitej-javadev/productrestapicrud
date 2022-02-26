package com.saitej.productrestapi.productrestapicrud.repositories;

import com.saitej.productrestapi.productrestapicrud.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

    Product getByName(String name);
}
