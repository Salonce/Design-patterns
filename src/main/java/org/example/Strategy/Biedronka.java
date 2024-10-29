package org.example.Strategy;

public class Biedronka implements Shop{

    @Override
    public String buyGroceries() {
        return "Customer goes to biedronka.\nThey buy chocolate and chips.";
    }
}
