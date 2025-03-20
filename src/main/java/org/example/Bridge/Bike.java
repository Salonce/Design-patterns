package org.example.Bridge;

public class Bike extends Vehicle {

    public Bike(Workshop workshop1, Workshop workshop2){
        super(workshop1, workshop2);
    }

    @Override
    public String work() {
        return "Making a bike." + "\n" + workshop1.work() + "\n" + workshop2.work();
    }
}