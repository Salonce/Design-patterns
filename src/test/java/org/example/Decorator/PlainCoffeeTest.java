package org.example.Decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlainCoffeeTest {

    PlainCoffee plainCoffee = new PlainCoffee();

    @Test
    void drink() {
        Assertions.assertEquals("Drink plain coffee", plainCoffee.drink());
    }

    @Test
    void getCost() {
        Assertions.assertEquals(2.0f, plainCoffee.getCost());
    }
}