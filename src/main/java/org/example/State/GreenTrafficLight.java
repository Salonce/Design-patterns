package org.example.State;

public class GreenTrafficLight implements TrafficLightState{
    @Override
    public LightColor getColor(){
        return LightColor.GREEN;
    }
    @Override
    public TrafficLightState nextState() {
        return new RedTrafficLight();
    }
}
