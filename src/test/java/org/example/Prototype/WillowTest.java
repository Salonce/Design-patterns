package org.example.Prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WillowTest {

    private Tree willow;
    private Tree willowClone;
    private String name;
    private int year;

    @BeforeEach
    void setUp(){
        name = "Old willow";
        year = 2001;
        willow = new Willow(name, year);
        willowClone = willow.clone();
    }

    @Test
    void testClone() {
        Assertions.assertEquals(name, willowClone.getName());
        Assertions.assertEquals(year, willowClone.getPlantingDate());
        Assertions.assertNotSame(willow, willowClone);
    }
}