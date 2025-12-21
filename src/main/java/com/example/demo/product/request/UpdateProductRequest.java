package com.example.demo.product.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class UpdateProductRequest extends ProductRequest {

    private final long id;

    @JsonCreator
    public UpdateProductRequest(String name, Long id)
    {
        super(name);
        this.id = id;

    }
    public long getId() {
        return id;
    }





}
