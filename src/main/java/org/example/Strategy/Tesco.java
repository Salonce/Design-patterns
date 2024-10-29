package org.example.Strategy;

public class Tesco implements Shop{
    @Override
    public String buyGroceries() {
        return "Customer goes to Tesco.\nThey buy buns and water.";
    }
}
