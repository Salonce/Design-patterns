package org.example.Bridge;

public class Car extends Vehicle {

    public Car(Workshop workshop1, Workshop workshop2){
        super(workshop1, workshop2);
    }

    @Override
    public void work() {
        System.out.println("Making a car." + "\n" + workshop1.work() + "\n" + workshop2.work());
    }
}
