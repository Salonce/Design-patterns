package org.example.Decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.OngoingStubbing;

class MilkDecoratorTest {

    private static Coffee plainCoffee;
    private static Coffee blackCoffee;
    private static MilkDecorator milkDecorator;
    private static MilkDecorator milkDecorator2;

    @BeforeAll
    static void prepare(){
        plainCoffee = Mockito.mock();
        Mockito.when(plainCoffee.getCost()).thenReturn(0.0f);
        Mockito.when(plainCoffee.drink()).thenReturn("Drank plain coffee");

        blackCoffee = Mockito.mock();
        OngoingStubbing<Float> floatOngoingStubbing = Mockito.when(blackCoffee.getCost()).thenReturn(5.0f);
        Mockito.when(blackCoffee.drink()).thenReturn("Drank black coffee");

        milkDecorator = new MilkDecorator(plainCoffee);
        milkDecorator2 = new MilkDecorator(blackCoffee);
    }

    @Test
    void drink() {
        Assertions.assertEquals("Drank plain coffee, milk", milkDecorator.drink());
        Assertions.assertEquals("Drank black coffee, milk", milkDecorator2.drink());
    }

    @Test
    void getCost() {
        Assertions.assertEquals(1.2f, milkDecorator.getCost());
        Assertions.assertEquals(6.2f, milkDecorator2.getCost());
    }
}