package org.example.Builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testAddressBuilder() {
        Address address = new Address.AddressBuilder()
                .setCode(15)
                .setCity("city")
                .setStreet("street")
                .build();

        Assertions.assertEquals(15, address.getCode());
        Assertions.assertEquals("city", address.getCity());
        Assertions.assertEquals("street", address.getStreet());
    }

    @Test
    void testDefaultAddressBuilder() {
        Address address = new Address.AddressBuilder()
                .setCity("city")
                .setStreet("street")
                .build();

        Assertions.assertEquals(0, address.getCode());
        Assertions.assertEquals("city", address.getCity());
        Assertions.assertEquals("street", address.getStreet());
    }
}