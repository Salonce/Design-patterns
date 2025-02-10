package org.example.Adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrinterAdapterTest {

    private LegacyPrinter legacyPrinter;
    private Printer printer;
    private String text;

    @BeforeEach
    void setUp() {
        this.text = "Text to print";
        this.legacyPrinter = new LegacyPrinter(text);
        this.printer = new PrinterAdapter(legacyPrinter);
    }

    @Test
    void print() {
        Assertions.assertEquals(text, printer.print());
    }
}