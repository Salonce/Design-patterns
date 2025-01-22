package org.example.Bridge;

public class Producer implements Workshop{
    @Override
    public String work() {
        return "Produce.";
    }
}
