package org.example.Mediator;

import java.util.ArrayList;
import java.util.List;

public class BlackSeaDock implements Dock{

    private String dockName;
    private List<Ship> dockedShips = new ArrayList<>();

    public BlackSeaDock(String name){
        this.dockName = name;
    }

    public List<Ship> getDockedShips() {
        return dockedShips;
    }

    @Override
    public void requestDocking(Ship ship) {
        if (dockedShips.contains(ship))
            System.out.println(dockName + ": " + "Ship " + ship.getName() + " requests docking, but it is already in the dock.");
        else{
            System.out.println(dockName + ": " + "Docking request granted to ship " + ship.getName());
            dockedShips.add(ship);
        }
    }

    @Override
    public void requestLeaving(Ship ship) {
        if (!dockedShips.contains(ship))
            System.out.println(dockName + ": " + "Ship " + ship.getName() + " requests leaving, but it is not in the dock.");
        else{
            System.out.println(dockName + ": " + "Leaving request granted to ship " + ship.getName());
            dockedShips.remove(ship);
        }
    }
}
