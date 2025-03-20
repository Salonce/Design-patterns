package org.example.Bridge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssemblerTest {

    private Workshop assembler;

    @BeforeEach
    void setUp() {
        assembler = new Assembler();
    }

    @Test
    void work() {
        Assertions.assertEquals("Assemble.", assembler.work());
    }
}