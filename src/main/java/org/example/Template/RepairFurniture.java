package org.example.Template;

public abstract class RepairFurniture {

    public final String repair(){
        return choosePiece() + "\n" + chooseTool() + "\n" + work();
    }

    abstract String choosePiece();
    abstract String chooseTool();

    String work(){
        return "Repairing furniture.";
    }
}
