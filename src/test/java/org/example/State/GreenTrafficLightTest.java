package org.example.State;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreenTrafficLightTest {

    private TrafficLightState trafficLightState;

    @BeforeEach
    void setup(){
        trafficLightState = new GreenTrafficLight();
    }

    @Test
    void getColor() {
        Assertions.assertEquals(LightColor.GREEN, trafficLightState.getColor());
    }

    @Test
    void nextState() {
        trafficLightState = trafficLightState.nextState();
        Assertions.assertEquals(LightColor.RED, trafficLightState.getColor());
    }
}