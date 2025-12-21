package com.example.demo.product.service;

import com.example.demo.product.request.UpdateProductRequest;
import com.example.demo.product.support.exception.ProductExceptionSupplier;
import org.springframework.stereotype.Service;
import com.example.demo.product.domain.Product;
import com.example.demo.product.repository.ProductRepository;
import com.example.demo.product.request.ProductRequest;
import com.example.demo.product.response.ProductResponse;
import com.example.demo.product.support.ProductMapper;
import java.util.stream.Collectors;


import java.util.List;

@Service
public class ProductService {

    private final ProductRepository ProductRepository;
    private final ProductMapper productMapper;



    public ProductService(ProductRepository oldProductRepository, ProductMapper productMapper) {
        this.ProductRepository = oldProductRepository;
        this.productMapper = productMapper;
    }

    public ProductResponse create(ProductRequest productRequest) {
        Product product = ProductRepository.save(productMapper.toProduct(productRequest));
        return productMapper.toProductResponse(product);
    }

    public ProductResponse update(Long id, UpdateProductRequest updateProductRequest) {
        Product product= ProductRepository.findById(id).orElseThrow(ProductExceptionSupplier.productNotFound(id));
        ProductRepository.save(productMapper.toProduct(product, updateProductRequest));
        return productMapper.toProductResponse(product);
    }


    public List<ProductResponse> findAll(){
        return ProductRepository.findAll().stream().map(productMapper::toProductResponse).collect(Collectors.toList());
    }


    public void delete(Long id){
        Product product = ProductRepository.findById(id).orElseThrow(ProductExceptionSupplier.productNotFound(id));
        ProductRepository.deleteById(product.getId());
    }

    public ProductResponse find(Long id) {
        Product product = ProductRepository.findById(id)
                .orElseThrow(ProductExceptionSupplier.productNotFound(id));

        return productMapper.toProductResponse(product);
    }




}
