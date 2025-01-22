package org.example;

import org.example.Decorator.Coffee;
import org.example.Decorator.MilkDecorator;
import org.example.Decorator.PlainCoffee;
import org.example.Decorator.SugarDecorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SugarDecorator(new MilkDecorator(new PlainCoffee()));
        System.out.println(coffee.drink());
        System.out.println("\nCost of the coffee: " + coffee.getCost() + " PLN");
    }
}
