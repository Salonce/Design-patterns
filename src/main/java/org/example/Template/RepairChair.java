package org.example.Template;

public class RepairChair extends RepairFurniture {

    @Override
    String choosePiece(){
        return "Choosing a chair.";
    }

    @Override
    String chooseTool(){
        return "Choosing a hammer.";
    }
}
