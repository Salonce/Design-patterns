package org.example.Decorator;

public class PlainCoffee implements Coffee{
    @Override
    public String drink() {
        return "Drink plain coffee";
    }

    @Override
    public float getCost() {
        return 2.0f;
    }
}
