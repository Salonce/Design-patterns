package org.example.Iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student martha;
    private Student jack;

    @BeforeEach
    public void setup(){
        martha = new Student("Martha", 15);
        jack = new Student("Jack", 16);
    }

    @Test
    void name() {
        Assertions.assertEquals("Martha", martha.name());
        Assertions.assertEquals("Jack", jack.name());
    }

    @Test
    void age() {
        Assertions.assertEquals(15, martha.age());
        Assertions.assertEquals(16, jack.age());
    }
}