package org.example.Template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RepairLampTest {

    @Test
    void repair() {
        RepairFurniture repairLamp = new RepairLamp();
        String expected = "Grabbing a lamp.\nPicking a screwdriver.\nRepairing furniture.";
        Assertions.assertEquals(expected, repairLamp.repair());
    }

}