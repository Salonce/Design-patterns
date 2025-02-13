package org.example.Prototype;

public class Willow implements Tree{

    private String name;
    private int plantingDate;

    public Willow(String name, int plantingDate){
        this.name = name;
        this.plantingDate = plantingDate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPlantingDate(){
        return plantingDate;
    }

    @Override
    public Tree clone(){
        return new Willow(name, plantingDate);
    }
}
