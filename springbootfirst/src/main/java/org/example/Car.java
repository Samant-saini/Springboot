package org.example;

public class Car {
    Engine engine;
    Car(){

    }
    Car( Engine engine) {
        System.out.println("car constructor  arg DI con...");
        this.engine=engine;

    }
    // setter dependency
    public void setEngine(Engine engine){
        System.out.println("car setter started");
        this.engine=engine;
    }
    public void drive(){
        int res=engine.start();
        if(res>=1){
            System.out.println("car  started");
        }
        else{
            System.out.println("not working");
        }
    }
}
