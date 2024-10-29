package org.example.Strategy;

public class Zabka implements Shop{
    @Override
    public String buyGroceries() {
        return "Customer goes to Zabka.\nThey buy milk and bread.";
    }
}
