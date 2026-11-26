package com.example.autowire.type;

public class Car {
    Specification carSpecification ;

    public void setCarSpecification(Specification carSpecification) {
        this.carSpecification = carSpecification;
    }

    public void displaySpecification(){
        System.out.println(carSpecification.toString());
    }
}
