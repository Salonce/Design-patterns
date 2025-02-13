package org.example.Prototype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OakTest {

    private Tree oak;
    private Tree oakClone;
    private String name;
    private int year;

    @BeforeEach
    void setUp(){
        name = "Old oak";
        year = 1998;
        oak = new Oak(name, year);
        oakClone = oak.clone();
    }

    @Test
    void testClone() {
        Assertions.assertEquals(name, oakClone.getName());
        Assertions.assertEquals(year, oakClone.getPlantingDate());
        Assertions.assertNotSame(oak, oakClone);
    }
}