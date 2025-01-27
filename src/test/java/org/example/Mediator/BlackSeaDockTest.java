package org.example.Mediator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BlackSeaDockTest {

    private BlackSeaDock blackSeaDock;
    private Ship ship;

    @BeforeEach
    void setup(){
        blackSeaDock = new BlackSeaDock("Wooden dock");
        ship = Mockito.mock(Ship.class);
    }

    @Test
    void getDockedShips(){
        Assertions.assertTrue(blackSeaDock.getDockedShips().isEmpty());
        blackSeaDock.requestDocking(ship);
        Assertions.assertEquals(1, blackSeaDock.getDockedShips().size());
    }

    @Test
    void requestDocking() {
        Assertions.assertFalse(blackSeaDock.getDockedShips().contains(ship));
        blackSeaDock.requestDocking(ship);
        Assertions.assertTrue(blackSeaDock.getDockedShips().contains(ship));
    }

    @Test
    void requestLeaving() {
        Assertions.assertFalse(blackSeaDock.getDockedShips().contains(ship));
        blackSeaDock.requestDocking(ship);
        Assertions.assertTrue(blackSeaDock.getDockedShips().contains(ship));
        blackSeaDock.requestLeaving(ship);
        Assertions.assertFalse(blackSeaDock.getDockedShips().contains(ship));
    }
}