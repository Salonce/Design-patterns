package org.example.Decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public String drink() {
        return coffee.drink() + ", milk";
    }

    @Override
    public float getCost(){
        return coffee.getCost() + 1.2f;
    }
}
