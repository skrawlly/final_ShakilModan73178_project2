package com.example.demo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.info.Info;
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title="products API for Vistula",version = "1.0",description= "products Information"))

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

