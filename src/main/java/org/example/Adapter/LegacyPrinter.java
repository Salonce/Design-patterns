package org.example.Adapter;

public class LegacyPrinter {
    private String text;

    public LegacyPrinter(String text){
        this.text = text;
    };

    public String printDocument(){
        return text;
    };
}
