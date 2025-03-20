package org.example.Bridge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProducerTest {

    private Workshop producer;

    @BeforeEach
    void setUp() {
        producer = new Assembler();
    }

    @Test
    void work() {
        Assertions.assertEquals("Assemble.", producer.work());
    }
}