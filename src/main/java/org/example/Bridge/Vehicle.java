package org.example.Bridge;

public abstract class Vehicle {

    public Vehicle(Workshop workshop1, Workshop workshop2){
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }

    protected Workshop workshop1;
    protected Workshop workshop2;

    public abstract String work();
}