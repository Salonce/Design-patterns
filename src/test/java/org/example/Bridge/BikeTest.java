package org.example.Bridge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BikeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void work() {
        Workshop workshop1 = Mockito.mock(Workshop.class);
        Workshop workshop2 = Mockito.mock(Workshop.class);

        Mockito.when(workshop1.work()).thenReturn("Pedals work done.");
        Mockito.when(workshop2.work()).thenReturn("Handlebar work done.");

        Bike bike = new Bike(workshop1, workshop2);

        String expected = "Making a bike.\nPedals work done.\nHandlebar work done.";

        Assertions.assertEquals(expected, bike.work());
    }
}