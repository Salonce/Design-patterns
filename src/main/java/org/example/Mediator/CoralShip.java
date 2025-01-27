package org.example.Mediator;

public class CoralShip implements Ship{

    private String name;
    private Dock dock;

    public CoralShip(Dock dock, String name){
        this.name = name;
        this.dock = dock;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void requestDocking() {
        dock.requestDocking(this);
    }

    @Override
    public void requestLeaving() {
        dock.requestLeaving(this);
    }
}
