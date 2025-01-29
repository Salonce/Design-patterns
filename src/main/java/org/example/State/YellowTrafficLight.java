package org.example.State;

public class YellowTrafficLight implements TrafficLightState {
    @Override
    public LightColor getColor(){
        return LightColor.YELLOW;
    }
    @Override
    public TrafficLightState nextState() {
        return new GreenTrafficLight();
    }
}
