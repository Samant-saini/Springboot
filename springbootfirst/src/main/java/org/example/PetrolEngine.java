package org.example;

public class PetrolEngine implements Engine {
    PetrolEngine(){

        System.out.println("Petrol engine cons....");

    }
    public int start(){
        System.out.println("petrol engine has started");
        return 1;
    }

}
