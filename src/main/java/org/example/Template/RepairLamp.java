package org.example.Template;

public class RepairLamp extends RepairFurniture {

    @Override
    String chooseTool(){
        return "Picking a screwdriver.";
    }

    @Override
    String choosePiece(){
        return "Grabbing a lamp.";
    }
}
