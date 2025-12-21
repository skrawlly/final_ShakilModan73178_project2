package com.example.demo.product.response;

public class ProductResponse {


    private  final long id;
    private final String name;

    public ProductResponse(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName(){return name;}

    public long getId() {
        return id;
    }

}
