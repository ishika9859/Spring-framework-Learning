package com.example.autowire.name;

public class Car {
    Specification carSpecification ;

    public void setCarSpecification(Specification carSpecification) {
        this.carSpecification = carSpecification;
    }

    public void displaySpecification(){
        System.out.println(carSpecification.toString());
    }
}
