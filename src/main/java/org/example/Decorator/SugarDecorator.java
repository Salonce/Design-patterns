package org.example.Decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String drink() {
        return coffee.drink() + ", sugar";
    }

    @Override
    public float getCost() {
        return coffee.getCost() + 0.5f;
    }
}
