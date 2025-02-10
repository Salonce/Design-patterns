package org.example.Proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealBookTest {

    private RealBook realBook;

    @BeforeEach
    void setUp(){
        this.realBook = new RealBook("Pride and prejudice");
    }

    @Test
    void read() {
        Assertions.assertEquals(realBook.read(), "Reading Pride and prejudice");
    }
}