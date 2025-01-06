package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static  void main(String[] args) {
        // Initialize the Spring ApplicationContext using beans.xml configuration
        System.out.println("beans started");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        // Verify the context is loaded
        System.out.println("type of car stated:");

        Car car=applicationContext.getBean(Car.class);
        car.drive();

    }
}
