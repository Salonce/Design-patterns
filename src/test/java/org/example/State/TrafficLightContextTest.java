package org.example.State;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class TrafficLightContextTest {

    private TrafficLightContext trafficLightContext;
    private TrafficLightState trafficLightState;
    private TrafficLightState trafficLightState2;

    @BeforeEach
    void setup(){
        trafficLightState = Mockito.mock(TrafficLightState.class);
        trafficLightState2 = Mockito.mock(TrafficLightState.class);
        Mockito.when(trafficLightState.getColor()).thenReturn(LightColor.GREEN);
        Mockito.when(trafficLightState.nextState()).thenReturn(trafficLightState2);
        trafficLightContext = new TrafficLightContext(trafficLightState);
    }

    @Test
    void changeTrafficLight() {
        Assertions.assertSame(trafficLightState, trafficLightContext.getTrafficLightState());
        trafficLightContext.changeTrafficLight();
        Assertions.assertSame(trafficLightState2, trafficLightContext.getTrafficLightState());
    }

    @Test
    void getLightColor() {
        Assertions.assertSame(LightColor.GREEN, trafficLightContext.getLightColor());
    }
}