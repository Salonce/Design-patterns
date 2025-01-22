package org.example.FactoryMethod;

public class HondaFactory implements MotorcycleFactory {
    public Motorcycle produceMotorcycle(){
        return new Honda();
    }
}
