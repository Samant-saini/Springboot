package org.example;

public class DieselEngine implements Engine{
   DieselEngine(){
        System.out.println("Diesel engine conn..");

    }
    public int start(){
        System.out.println("Diesel engine has started");
        return 1;
    }
}
