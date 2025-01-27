package org.example.Mediator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CoralShipTest {

    private Dock dock;
    private CoralShip coralShip;

    @BeforeEach
    void setup(){
        dock = Mockito.mock(Dock.class);
        coralShip = new CoralShip(dock, "Coral ship");
    }

    @Test
    void getName() {
        Assertions.assertEquals("Coral ship", coralShip.getName());
    }

    @Test
    void requestDocking() {
        coralShip.requestDocking();
        Mockito.verify(dock).requestDocking(coralShip);
    }

    @Test
    void requestLeaving() {
        coralShip.requestLeaving();
        Mockito.verify(dock).requestLeaving(coralShip);
    }
}