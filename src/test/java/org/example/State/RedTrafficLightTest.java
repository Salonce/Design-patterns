package org.example.State;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RedTrafficLightTest {

    private TrafficLightState trafficLightState;

    @BeforeEach
    void setup(){
        trafficLightState = new RedTrafficLight();
    }

    @Test
    void getColor() {
        Assertions.assertEquals(LightColor.RED, trafficLightState.getColor());
    }

    @Test
    void nextState() {
        trafficLightState = trafficLightState.nextState();
        Assertions.assertEquals(LightColor.YELLOW, trafficLightState.getColor());
    }
}