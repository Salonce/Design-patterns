package org.example.Adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LegacyPrinterTest {

    private LegacyPrinter legacyPrinter;
    String text;

    @BeforeEach
    void setUp(){
        text = "Text to print.";
        this.legacyPrinter = new LegacyPrinter(text);
    }

    @Test
    void printDocument() {
        Assertions.assertEquals(text, legacyPrinter.printDocument());
    }
}