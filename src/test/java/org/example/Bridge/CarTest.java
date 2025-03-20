package org.example.Bridge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void work() {
       Workshop workshop1 = Mockito.mock(Workshop.class);
       Workshop workshop2 = Mockito.mock(Workshop.class);

       Mockito.when(workshop1.work()).thenReturn("Engine work done.");
       Mockito.when(workshop2.work()).thenReturn("Body work done.");

       Car car = new Car(workshop1, workshop2);

       String expected = "Making a car.\nEngine work done.\nBody work done.";

       Assertions.assertEquals(expected, car.work());
    }
}