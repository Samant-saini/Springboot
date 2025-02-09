package com.example.demo.Services;


import com.example.demo.product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class productServices {
    List<product> products= Arrays.asList(new product(101,"samsung",3000),
            new product(102,"apple",4000),
            new product(103,"nokia",5000));

    public List<product> getProduct(){
        return products;
    }
}
