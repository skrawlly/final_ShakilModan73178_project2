package com.example.demo.product.support;

import com.example.demo.product.request.UpdateProductRequest;
import org.springframework.stereotype.Component;
import com.example.demo.product.domain.Product;
import com.example.demo.product.request.ProductRequest;
import com.example.demo.product.response.ProductResponse;


@Component
public class ProductMapper {


    public Product toProduct(ProductRequest productRequest){
        Product product = new Product();
        product.setName(productRequest.getName());
        return product;
    }

    public Product toProduct(Product product, UpdateProductRequest  updateProductRequest){
         product.setName(updateProductRequest.getName());
         return product;
    }


    public ProductResponse toProductResponse(Product product){
        return new ProductResponse(product.getId(),product.getName());
    }


}
