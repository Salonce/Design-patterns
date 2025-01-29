package org.example.State;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YellowTrafficLightTest {

    private TrafficLightState trafficLightState;

    @BeforeEach
    void setup(){
        trafficLightState = new YellowTrafficLight();
    }

    @Test
    void getColor() {
        Assertions.assertEquals(LightColor.YELLOW, trafficLightState.getColor());
    }

    @Test
    void nextState() {
        trafficLightState = trafficLightState.nextState();
        Assertions.assertEquals(LightColor.GREEN, trafficLightState.getColor());
    }
}