package org.example.Template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepairChairTest {

    @Test
    void repair() {
        RepairFurniture repairChair = new RepairChair();
        String expected = "Choosing a chair.\nChoosing a hammer.\nRepairing furniture.";
        Assertions.assertEquals(expected, repairChair.repair());
    }

}