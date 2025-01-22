package org.example.Bridge;

public class Assembler implements Workshop{
    @Override
    public String work() {
        return "Assemble.";
    }
}
