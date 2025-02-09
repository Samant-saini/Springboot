package com.example.demo.Controller;


import com.example.demo.Services.productServices;
import com.example.demo.product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class productController {
    @Autowired
    productServices services;

    @RequestMapping("/products")
    public List<product> getProduct(){
        return services.getProduct();

    }
}
