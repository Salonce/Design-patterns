package org.example.State;

public class RedTrafficLight implements TrafficLightState {
    @Override
    public LightColor getColor(){
        return LightColor.RED;
    }
    @Override
    public TrafficLightState nextState() {
        return new YellowTrafficLight();
    }
}
