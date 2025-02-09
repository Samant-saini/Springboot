package com.example.demo;

public class product {
    private int prodId;



    private String productName;
    private int price;

    public product(int a, String b, int c) {
        this.prodId=a;
        this.productName=b;
        this.price=c;
    }


    public int getProdId() {
        return prodId;
    }
    public String getProductName(){
        return productName;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProdId(int prodId) {

        this.prodId = prodId;
    }

}
