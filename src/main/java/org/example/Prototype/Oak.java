package org.example.Prototype;

public class Oak implements Tree{
    private String name;
    private int plantingDate;

    public Oak(String name, int plantingDate){
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
        return new org.example.Prototype.Willow(name, plantingDate);
    }
}
