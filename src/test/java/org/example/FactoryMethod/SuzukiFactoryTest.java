package org.example.FactoryMethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SuzukiFactoryTest {

    @Test
    public void shouldProduceSuzuki() {
        MotorcycleFactory suzukiFactory = new SuzukiFactory();
        Motorcycle suzuki = suzukiFactory.produceMotorcycle();

        Assertions.assertTrue(suzuki instanceof Suzuki, "Motorcycle produced should be suzuki, not: " + suzuki.getClass());

    }
}