package org.example.Adapter;

public class PrinterAdapter implements Printer {
    private LegacyPrinter legacyPrinter;

    public PrinterAdapter(LegacyPrinter legacyPrinter){
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public String print() {
        return legacyPrinter.printDocument();
    }
}
