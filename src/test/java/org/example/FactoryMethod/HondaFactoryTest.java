package org.example.FactoryMethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HondaFactoryTest {

    @Test
    public void shouldProduceHonda(){
        MotorcycleFactory hondaFactory = new HondaFactory();
        Motorcycle honda = hondaFactory.produceMotorcycle();

        Assertions.assertTrue(honda instanceof Honda, "Produced motorcycle should be honda, not: " + honda.getClass());
    }

}