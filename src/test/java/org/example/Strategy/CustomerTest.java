package org.example.Strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private Customer customer;
    @BeforeEach
    void setUp(){
        this.customer = new Customer();
    }

    @Test
    void buyGroceries() {
        String shopping = "Shopping today";
        Shop shop = Mockito.mock(Shop.class);

        Mockito.when(shop.buyGroceries()).thenReturn(shopping);
        customer.setShop(shop);

        Assertions.assertEquals(shopping, shop.buyGroceries());
    }
}