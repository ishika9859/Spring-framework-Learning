package com.example.autowire.constructor;

public class Car {
    Specification carSpecification ;

    public Car(Specification carSpecification) {
        this.carSpecification = carSpecification;
    }
//    public void setCarSpecification(Specification carSpecification) {
//
//        this.carSpecification = carSpecification;
//    }

    public void displaySpecification(){
        System.out.println(carSpecification.toString());
    }
}
