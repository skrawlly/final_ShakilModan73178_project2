package com.example.demo.product.repository;

import org.springframework.stereotype.Repository;
import com.example.demo.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {
}
