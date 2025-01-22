package org.example.FactoryMethod;

public class SuzukiFactory implements MotorcycleFactory {
    @Override
    public Motorcycle produceMotorcycle() {
        return new Suzuki();
    }
}
