package org.example.Decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class SugarDecoratorTest {

    private static Coffee plainCoffee;
    private static Coffee blackCoffee;
    private static SugarDecorator sugarDecorator1;
    private static SugarDecorator sugarDecorator2;

    @BeforeAll
    static void prepare(){
        plainCoffee = Mockito.mock();
        Mockito.when(plainCoffee.drink()).thenReturn("Drank plain coffee");
        Mockito.when(plainCoffee.getCost()).thenReturn(0.0f);

        blackCoffee = Mockito.mock();
        Mockito.when(blackCoffee.drink()).thenReturn("Drank black coffee");
        Mockito.when(blackCoffee.getCost()).thenReturn(5.0f);

        sugarDecorator1 = new SugarDecorator(plainCoffee);
        sugarDecorator2 = new SugarDecorator(blackCoffee);
    }

    @Test
    void drink() {
        Assertions.assertEquals("Drank plain coffee, sugar", sugarDecorator1.drink());
        Assertions.assertEquals("Drank black coffee, sugar", sugarDecorator2.drink());
    }

    @Test
    void getCost() {
        Assertions.assertEquals(0.5f, sugarDecorator1.getCost());
        Assertions.assertEquals(5.5f, sugarDecorator2.getCost());
    }
}