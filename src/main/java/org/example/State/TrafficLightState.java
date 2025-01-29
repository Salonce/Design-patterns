package org.example.State;

public interface TrafficLightState {
    LightColor getColor();
    TrafficLightState nextState();
}
