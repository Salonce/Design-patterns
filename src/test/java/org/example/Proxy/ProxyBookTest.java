package org.example.Proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyBookTest {

    private Book proxyBook;

    @BeforeEach
    void setUp() {
        this.proxyBook = new ProxyBook("Pride and prejudice");
    }

    @Test
    void read() {
        Assertions.assertEquals(proxyBook.read(), "Loading Pride and prejudice...\nReading Pride and prejudice");
        Assertions.assertEquals(proxyBook.read(), "Reading Pride and prejudice");
    }
}