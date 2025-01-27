package org.example;

import org.example.Command.Command;
import org.example.Command.WriteCommand;
import org.example.Iterator.Iterator;
import org.example.Iterator.Student;
import org.example.Iterator.StudentGroup;
import org.example.Iterator.StudentIterator;
import org.example.Mediator.BlackSeaDock;
import org.example.Mediator.CoralShip;
import org.example.Mediator.Dock;
import org.example.Mediator.Ship;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Dock blackSeaDock = new BlackSeaDock("Black sea dock");
        Ship coralShip = new CoralShip(blackSeaDock, "Coral ship");
        Ship grassShip = new CoralShip(blackSeaDock, "Grass ship");
        Ship stoneShip = new CoralShip(blackSeaDock, "Stone ship");

        coralShip.requestDocking();
        coralShip.requestDocking();
        coralShip.requestLeaving();
        coralShip.requestLeaving();
        coralShip.requestDocking();
        grassShip.requestDocking();
        stoneShip.requestDocking();
    }
}
